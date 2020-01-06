public class Main {
    public static void main(String[] args) {
        GetCityWeather getCityWeather=new GetCityWeather();

        //省份及直辖市城市编码不具有明显规律
        for(int live=0;live<2;live++){
            getCityWeather.GetWeather("110000",live);
            getCityWeather.GetWeather("120000",live);
            getCityWeather.GetWeather("130000",live);
            getCityWeather.GetWeather("140000",live);

            getCityWeather.GetWeather("210000",live);
            getCityWeather.GetWeather("220000",live);
            getCityWeather.GetWeather("230000",live);

            getCityWeather.GetWeather("310000",live);
            getCityWeather.GetWeather("320000",live);
            getCityWeather.GetWeather("330000",live);
            getCityWeather.GetWeather("340000",live);
            getCityWeather.GetWeather("350000",live);
            getCityWeather.GetWeather("360000",live);
            getCityWeather.GetWeather("370000",live);

            getCityWeather.GetWeather("410000",live);
            getCityWeather.GetWeather("420000",live);
            getCityWeather.GetWeather("430000",live);
            getCityWeather.GetWeather("440000",live);

            getCityWeather.GetWeather("460000",live);

            getCityWeather.GetWeather("500000",live);
            getCityWeather.GetWeather("510000",live);
            getCityWeather.GetWeather("520000",live);
            getCityWeather.GetWeather("530000",live);

            getCityWeather.GetWeather("610000",live);
            getCityWeather.GetWeather("620000",live);
            getCityWeather.GetWeather("630000",live);
            getCityWeather.GetWeather("710000",live);
        }
        System.out.println();
        System.out.println();
        System.out.println("共录入数据库（weatherconditions）23个省份、4个直辖市实况天气及未来四天预报！");
    }
}
