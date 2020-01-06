import net.sf.json.JSONObject;

public class GetCityWeather {

    public static String excute(String cityid,int live){
        String flag;
        if (live==1)
            flag="base";
        else
            flag="all";

        String url=
                "https://restapi.amap.com/v3/weather/weatherInfo?city="+cityid+"&extensions="+flag+"&output=JSON"+"&key=e6f815931d398ab579ba99357c7532b2";
        return PureNetUtil.get(url);
    }

    //存入实况天气数据
    public static boolean getbase(JSONObject pageBean){
        AddData adddate=new AddData();
        UpdData upddata=new UpdData();
        String adcode=pageBean.getString("adcode");

        adddate.add("livewea","adcode",adcode,"adcode",adcode,1);

        upddata.update("livewea","weather",pageBean.getString("weather"),adcode,"adcode",adcode);
        upddata.update("livewea","temperature",pageBean.getString("temperature"),adcode,"adcode",adcode);
        upddata.update("livewea","winddirection",pageBean.getString("winddirection"),adcode,"adcode",adcode);
        upddata.update("livewea","windpower",pageBean.getString("windpower"),adcode,"adcode",adcode);
        upddata.update("livewea","humidity",pageBean.getString("humidity"),adcode,"adcode",adcode);
        upddata.update("livewea","reporttime",pageBean.getString("reporttime"),adcode,"adcode",adcode);

        return true;
    }

    //存入预测天气数据
    public static boolean getall(JSONObject pageBean){
        AddData adddate=new AddData();
        UpdData upddata=new UpdData();

        String adcode=pageBean.getString("adcode");

        for (Object cast : pageBean.getJSONArray("casts")){
            JSONObject obj=(JSONObject)cast;
            String dates=obj.getString("date");

            adddate.add("daywea","adcode",adcode,"dates",dates,2);
            adddate.add("nightwea","adcode",adcode,"dates",dates,2);

            upddata.update("daywea","dayweather",obj.getString("dayweather"),adcode,"dates",dates);
            upddata.update("daywea","daytemp",obj.getString("daytemp"),adcode,"dates",dates);
            upddata.update("daywea","daywind",obj.getString("daywind"),adcode,"dates",dates);
            upddata.update("daywea","daypower",obj.getString("daypower"),adcode,"dates",dates);
            upddata.update("daywea","week",obj.getString("week"),adcode,"dates",dates);

            upddata.update("nightwea","nightweather",obj.getString("nightweather"),adcode,"dates",dates);
            upddata.update("nightwea","nighttemp",obj.getString("nighttemp"),adcode,"dates",dates);
            upddata.update("nightwea","nightwind",obj.getString("nightwind"),adcode,"dates",dates);
            upddata.update("nightwea","nightpower",obj.getString("nightpower"),adcode,"dates",dates);
            upddata.update("nightwea","week",obj.getString("week"),adcode,"dates",dates);
        }
        return true;
    }

    public static String GetWeather(String cityid,int live) {
        String result=excute(cityid,live);
        if (result!=null){
            JSONObject pageBean = JSONObject.fromObject(result);
            String flag1=pageBean.getString("status");
            String flag2=pageBean.getString("infocode");

            if((flag1!=null)&&(flag2!=null)&&(flag1.equals("1"))&&(flag2.equals("10000"))){

                if(live==1){
                    for (Object forecast : pageBean.getJSONArray("lives")) {
                        JSONObject object = (JSONObject) forecast;

                        if(getbase(object)){
                            System.out.println();
                            System.out.println(object.getString("city")+":实况天气存储成功！（表：livewea）");
                        }
                    }
                }else {
                    for (Object forecast : pageBean.getJSONArray("forecasts")) {
                        JSONObject object = (JSONObject) forecast;

                        AddData adddate=new AddData();
                        UpdData upddata=new UpdData();
                        String adcode=object.getString("adcode");

                        adddate.add("cityid","adcode",adcode,"adcode",adcode,1);
                        upddata.update("cityid","city",object.getString("city"),adcode,"adcode",adcode);
                        System.out.println();
                        System.out.println(object.getString("city")+"城市信息存储成功！（表：cityid）");

                        if(getall(object)){
                            System.out.println();
                            System.out.println(object.getString("city")+":预测天气存储成功！（表：daywea、nightwea）");
                        }
                    }
                }
            }
        }
        return result;
    }
}
