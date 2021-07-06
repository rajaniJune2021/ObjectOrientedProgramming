//package wrapperClassConcepts;
//
//import java.io.FileReader;
//
//public class RestAssiuredExample {
//
//    public void getManifestIdToken(String customerID, String clubCode, double amount) {
////    public static void main(String[] args) {
//        try {
//            RestAssured.baseURI = "https://apiuat1.ace.aaa.com/payment";
//            RequestSpecification rsp = RestAssured.given();
//            rsp.header("Content-Type", "application/json");
//            rsp.header("x-api-key", "nksbSlayuPyt6aXnE4FgusHmYnc23s");
//            FileReader fr = new FileReader("C:/Users/e678332/Desktop/manifestrequestbody.json");
//            JSONParser jsonParser = new JSONParser();
//            JSONObject jsonObject = (JSONObject) jsonParser.parse(fr);
//            jsonObject.put("customerId", customerID);
//            jsonObject.put("clubCode", clubCode);
//            jsonObject.put("amount", amount);
//            JSONArray jsonArray = jsonObject.getJSONArray("products");
//            JSONObject jsonObject1 = (JSONObject) jsonArray.get(0);
//            jsonObject1.put("amount",amount);
//            jsonObject1.put("productId","00005801");
//            rsp.body(jsonObject);
//            Response response = rsp.post("/v1/manifests");
//            String responseID = response.jsonPath().get("id");
//            System.out.println(responseID);
//            ResponseBody responseBody = response.getBody();
//            String apiResponse = responseBody.asString();
//            System.out.println();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void getMemberShipRules(){
//
//        try {
//            RestAssured.baseURI = "https://apis-stage-rtfint.ace.aaaclubnet.com/uat1-s-membership-rules";
//            RequestSpecification rsp1 = RestAssured.given();
//            rsp1.header("Content-Type","application/json");
//            rsp1.header("client_id","5d32354008f24972b9ca13fe7c4e473c");
//            rsp1.header("client_secret","9885f76FC6C846779CEef931f0230c5d");
//            rsp1.header("Authorization","Bearer  eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Im5PbzNaRHJPRFhFSzFqS1doWHNsSFJfS1hFZyIsImtpZCI6Im5PbzNaRHJPRFhFSzFqS1doWHNsSFJfS1hFZyJ9.eyJhdWQiOiJhcGk6Ly9hY2VjbHVibmV0Lm9ubWljcm9zb2Z0LmNvbS9tdWxlc29mdC9tZW1iZXJzaGlwIiwiaXNzIjoiaHR0cHM6Ly9zdHMud2luZG93cy5uZXQvZDVmNjE4ZmYtMjk1MS00OTA0LThmN2UtOTk5YzJkZDk3YWIyLyIsImlhdCI6MTYxODQ0NTUxMSwibmJmIjoxNjE4NDQ1NTExLCJleHAiOjE2MTg0NDk0MTEsImFpbyI6IkUyWmdZT2lKNS90VGMzbjZ2ZjZmaFFrQ2gvODdBZ0E9IiwiYXBwaWQiOiI5MTEzZTY1YS0yNDkwLTQxNTgtYmE5Ny1iOGU2OTVhZjdhMDEiLCJhcHBpZGFjciI6IjIiLCJpZHAiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC9kNWY2MThmZi0yOTUxLTQ5MDQtOGY3ZS05OTljMmRkOTdhYjIvIiwib2lkIjoiOTIwY2I2ZTgtMjBhZC00M2Q2LTk1MmItODRkNDhiZmY3YmE5IiwicmgiOiIwLkFXNEFfeGoyMVZFcEJFbVBmcG1jTGRsNnNscm1FNUdRSkZoQnVwZTQ1cFd2ZWdGdUFBQS4iLCJzdWIiOiI5MjBjYjZlOC0yMGFkLTQzZDYtOTUyYi04NGQ0OGJmZjdiYTkiLCJ0aWQiOiJkNWY2MThmZi0yOTUxLTQ5MDQtOGY3ZS05OTljMmRkOTdhYjIiLCJ1dGkiOiJfOWc4dnJPTEgwYWNJRlpBdE5DQ0FBIiwidmVyIjoiMS4wIiwibXVsZVNhbUFjY291bnROYW1lIjoidGlkMDAzNzcifQ.at3cNqTii4lHcVqV9N9QHsITnjmpc-StTB4T88oHbMLiQBB5QxT4fDbtZpoaPxTAU_7HMRxIWyvI0hqJ2ttxtz4FzSHqG5_3S-Yd5ZSmArs2sEDGSC534vGyqtD9lHexRdOC_oq-6092pb3ybgDxnOHSMwr-W0ptJq4rxjlVJcqYtkrAxDZlIkP8Xu1aJzE7fUR7paTLfEiLx_IetUZQ5kMuiOEAXlr9QTW_YEtdaQw2KFxUIx_QJLVA940l8iuuVJi8znTnZA0DzVUZhTtgGst5Uge5EDDiUO1XfKaht7kFrhybYhi0I4vxhD3OrySugEQeGKNFzJJWyJa5gdBVow");
//            FileReader fr = new FileReader("C:/Users/e678332/Desktop/memershiprules.json");
//            JSONParser jsonParser = new JSONParser();
//            JSONObject jsonObject = (JSONObject) jsonParser.parse(fr);
//            rsp1.body(jsonObject);
//            Response response = rsp1.post("/v1/membership/rules");
//            org.json.simple.JSONArray
//
//        }catch (Exception e){
//
//
//        }
//    }
//
//}
//}
