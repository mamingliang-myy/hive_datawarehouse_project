package org.mml.kafka;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.Iterator;

/**
 * @Package: org.mml.kafka
 * @ClassName: Json_Test
 * @Author: maml
 * @CreateTime: 2020/12/16 17:19
 * @Description:
 */
public class Json_Test {
    public static void main(String[] args) {
        String json ="{\"schema\":{\"type\":\"struct\",\"fields\":[{\"type\":\"struct\",\"fields\":[{\"type\":\"string\",\"optional\":false,\"field\":\"depno\"},{\"type\":\"string\",\"optional\":false,\"field\":\"riskcode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"oldriskcode\"},{\"type\":\"string\",\"optional\":false,\"field\":\"riskcname\"},{\"type\":\"string\",\"optional\":true,\"field\":\"riskscname\"},{\"type\":\"string\",\"optional\":true,\"field\":\"risktname\"},{\"type\":\"string\",\"optional\":true,\"field\":\"riskename\"},{\"type\":\"string\",\"optional\":true,\"field\":\"risksename\"},{\"type\":\"string\",\"optional\":false,\"field\":\"riskattribute\"},{\"type\":\"string\",\"optional\":false,\"field\":\"salearealevel\"},{\"type\":\"string\",\"optional\":true,\"field\":\"materialcontxt\"},{\"type\":\"string\",\"optional\":true,\"field\":\"classcode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"framecode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"reportno\"},{\"type\":\"string\",\"optional\":true,\"field\":\"projectcode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"planind\"},{\"type\":\"string\",\"optional\":false,\"field\":\"accountlevel\"},{\"type\":\"string\",\"optional\":false,\"field\":\"reinslevel\"},{\"type\":\"string\",\"optional\":false,\"field\":\"managementlevel\"},{\"type\":\"string\",\"optional\":false,\"field\":\"statlevel\"},{\"type\":\"string\",\"optional\":true,\"field\":\"auditflag\"},{\"type\":\"string\",\"optional\":true,\"field\":\"agricultureflag\"},{\"type\":\"string\",\"optional\":true,\"field\":\"policyflag\"},{\"type\":\"string\",\"optional\":true,\"field\":\"policyprocessflag\"},{\"type\":\"string\",\"optional\":false,\"field\":\"isforce\"},{\"type\":\"string\",\"optional\":true,\"field\":\"requiredflag\"},{\"type\":\"int64\",\"optional\":true,\"name\":\"io.debezium.time.Timestamp\",\"version\":1,\"field\":\"validdate\"},{\"type\":\"int64\",\"optional\":true,\"name\":\"io.debezium.time.Timestamp\",\"version\":1,\"field\":\"invaliddate\"},{\"type\":\"string\",\"optional\":false,\"field\":\"validstatus\"},{\"type\":\"string\",\"optional\":true,\"field\":\"templatecode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"clienttype\"},{\"type\":\"string\",\"optional\":true,\"field\":\"configtype\"},{\"type\":\"string\",\"optional\":true,\"field\":\"remark\"},{\"type\":\"string\",\"optional\":true,\"field\":\"synflag\"},{\"type\":\"int16\",\"optional\":true,\"field\":\"rateunit\"},{\"type\":\"string\",\"optional\":true,\"field\":\"shortrateflag\"},{\"type\":\"string\",\"optional\":true,\"field\":\"classflag\"},{\"type\":\"string\",\"optional\":true,\"field\":\"riskflag\"},{\"type\":\"string\",\"optional\":true,\"field\":\"autopaymentflag\"},{\"type\":\"string\",\"optional\":false,\"field\":\"updateflag\"},{\"type\":\"string\",\"optional\":true,\"field\":\"risklaunchdate\"},{\"type\":\"string\",\"optional\":true,\"field\":\"risklaunchnum\"},{\"type\":\"string\",\"optional\":true,\"field\":\"targetcustom\"},{\"type\":\"string\",\"optional\":true,\"field\":\"riskprofile\"},{\"type\":\"string\",\"optional\":true,\"field\":\"innovationlevel\"},{\"type\":\"string\",\"optional\":true,\"field\":\"restoreclasscode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"restoreriskcode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"isimpactflag\"},{\"type\":\"string\",\"optional\":true,\"field\":\"isfamilyamount\"},{\"type\":\"string\",\"optional\":false,\"field\":\"isdisclosure\"},{\"type\":\"string\",\"optional\":true,\"field\":\"nodisclosurereason\"},{\"type\":\"numeric\",\"optional\":true,\"field\":\"mindiscount\"},{\"type\":\"string\",\"optional\":true,\"field\":\"sexs\"},{\"type\":\"int16\",\"optional\":true,\"field\":\"tmaxage\"},{\"type\":\"int16\",\"optional\":true,\"field\":\"tminage\"},{\"type\":\"int16\",\"optional\":true,\"field\":\"bmaxage\"},{\"type\":\"int16\",\"optional\":true,\"field\":\"bminage\"},{\"type\":\"string\",\"optional\":true,\"field\":\"creatorcode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"updatercode\"},{\"type\":\"int64\",\"optional\":true,\"name\":\"io.debezium.time.Timestamp\",\"version\":1,\"field\":\"inserttimeforhis\"},{\"type\":\"int64\",\"optional\":true,\"name\":\"io.debezium.time.Timestamp\",\"version\":1,\"field\":\"operatetimeforhis\"},{\"type\":\"string\",\"optional\":true,\"field\":\"issecret\"},{\"type\":\"string\",\"optional\":true,\"field\":\"tagetype\"},{\"type\":\"string\",\"optional\":true,\"field\":\"bmaxagetype\"},{\"type\":\"string\",\"optional\":true,\"field\":\"bminagetype\"},{\"type\":\"int32\",\"optional\":true,\"field\":\"riskno\"},{\"type\":\"string\",\"optional\":true,\"field\":\"isapproval\"},{\"type\":\"string\",\"optional\":true,\"field\":\"relationriskcode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"relationrenewriskcode\"},{\"type\":\"string\",\"optional\":false,\"field\":\"isfrenchguestmodel\"},{\"type\":\"string\",\"optional\":true,\"field\":\"clienttypepolicy\"},{\"type\":\"string\",\"optional\":true,\"field\":\"isfinance\"}],\"optional\":true,\"name\":\"P008_South_PG_PROD_19.cpzxdb.public.cpzx_drisk_dep.Value\",\"field\":\"before\"},{\"type\":\"struct\",\"fields\":[{\"type\":\"string\",\"optional\":false,\"field\":\"depno\"},{\"type\":\"string\",\"optional\":false,\"field\":\"riskcode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"oldriskcode\"},{\"type\":\"string\",\"optional\":false,\"field\":\"riskcname\"},{\"type\":\"string\",\"optional\":true,\"field\":\"riskscname\"},{\"type\":\"string\",\"optional\":true,\"field\":\"risktname\"},{\"type\":\"string\",\"optional\":true,\"field\":\"riskename\"},{\"type\":\"string\",\"optional\":true,\"field\":\"risksename\"},{\"type\":\"string\",\"optional\":false,\"field\":\"riskattribute\"},{\"type\":\"string\",\"optional\":false,\"field\":\"salearealevel\"},{\"type\":\"string\",\"optional\":true,\"field\":\"materialcontxt\"},{\"type\":\"string\",\"optional\":true,\"field\":\"classcode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"framecode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"reportno\"},{\"type\":\"string\",\"optional\":true,\"field\":\"projectcode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"planind\"},{\"type\":\"string\",\"optional\":false,\"field\":\"accountlevel\"},{\"type\":\"string\",\"optional\":false,\"field\":\"reinslevel\"},{\"type\":\"string\",\"optional\":false,\"field\":\"managementlevel\"},{\"type\":\"string\",\"optional\":false,\"field\":\"statlevel\"},{\"type\":\"string\",\"optional\":true,\"field\":\"auditflag\"},{\"type\":\"string\",\"optional\":true,\"field\":\"agricultureflag\"},{\"type\":\"string\",\"optional\":true,\"field\":\"policyflag\"},{\"type\":\"string\",\"optional\":true,\"field\":\"policyprocessflag\"},{\"type\":\"string\",\"optional\":false,\"field\":\"isforce\"},{\"type\":\"string\",\"optional\":true,\"field\":\"requiredflag\"},{\"type\":\"int64\",\"optional\":true,\"name\":\"io.debezium.time.Timestamp\",\"version\":1,\"field\":\"validdate\"},{\"type\":\"int64\",\"optional\":true,\"name\":\"io.debezium.time.Timestamp\",\"version\":1,\"field\":\"invaliddate\"},{\"type\":\"string\",\"optional\":false,\"field\":\"validstatus\"},{\"type\":\"string\",\"optional\":true,\"field\":\"templatecode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"clienttype\"},{\"type\":\"string\",\"optional\":true,\"field\":\"configtype\"},{\"type\":\"string\",\"optional\":true,\"field\":\"remark\"},{\"type\":\"string\",\"optional\":true,\"field\":\"synflag\"},{\"type\":\"int16\",\"optional\":true,\"field\":\"rateunit\"},{\"type\":\"string\",\"optional\":true,\"field\":\"shortrateflag\"},{\"type\":\"string\",\"optional\":true,\"field\":\"classflag\"},{\"type\":\"string\",\"optional\":true,\"field\":\"riskflag\"},{\"type\":\"string\",\"optional\":true,\"field\":\"autopaymentflag\"},{\"type\":\"string\",\"optional\":false,\"field\":\"updateflag\"},{\"type\":\"string\",\"optional\":true,\"field\":\"risklaunchdate\"},{\"type\":\"string\",\"optional\":true,\"field\":\"risklaunchnum\"},{\"type\":\"string\",\"optional\":true,\"field\":\"targetcustom\"},{\"type\":\"string\",\"optional\":true,\"field\":\"riskprofile\"},{\"type\":\"string\",\"optional\":true,\"field\":\"innovationlevel\"},{\"type\":\"string\",\"optional\":true,\"field\":\"restoreclasscode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"restoreriskcode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"isimpactflag\"},{\"type\":\"string\",\"optional\":true,\"field\":\"isfamilyamount\"},{\"type\":\"string\",\"optional\":false,\"field\":\"isdisclosure\"},{\"type\":\"string\",\"optional\":true,\"field\":\"nodisclosurereason\"},{\"type\":\"numeric\",\"optional\":true,\"field\":\"mindiscount\"},{\"type\":\"string\",\"optional\":true,\"field\":\"sexs\"},{\"type\":\"int16\",\"optional\":true,\"field\":\"tmaxage\"},{\"type\":\"int16\",\"optional\":true,\"field\":\"tminage\"},{\"type\":\"int16\",\"optional\":true,\"field\":\"bmaxage\"},{\"type\":\"int16\",\"optional\":true,\"field\":\"bminage\"},{\"type\":\"string\",\"optional\":true,\"field\":\"creatorcode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"updatercode\"},{\"type\":\"int64\",\"optional\":true,\"name\":\"io.debezium.time.Timestamp\",\"version\":1,\"field\":\"inserttimeforhis\"},{\"type\":\"int64\",\"optional\":true,\"name\":\"io.debezium.time.Timestamp\",\"version\":1,\"field\":\"operatetimeforhis\"},{\"type\":\"string\",\"optional\":true,\"field\":\"issecret\"},{\"type\":\"string\",\"optional\":true,\"field\":\"tagetype\"},{\"type\":\"string\",\"optional\":true,\"field\":\"bmaxagetype\"},{\"type\":\"string\",\"optional\":true,\"field\":\"bminagetype\"},{\"type\":\"int32\",\"optional\":true,\"field\":\"riskno\"},{\"type\":\"string\",\"optional\":true,\"field\":\"isapproval\"},{\"type\":\"string\",\"optional\":true,\"field\":\"relationriskcode\"},{\"type\":\"string\",\"optional\":true,\"field\":\"relationrenewriskcode\"},{\"type\":\"string\",\"optional\":false,\"field\":\"isfrenchguestmodel\"},{\"type\":\"string\",\"optional\":true,\"field\":\"clienttypepolicy\"},{\"type\":\"string\",\"optional\":true,\"field\":\"isfinance\"}],\"optional\":true,\"name\":\"P008_South_PG_PROD_19.cpzxdb.public.cpzx_drisk_dep.Value\",\"field\":\"after\"},{\"type\":\"struct\",\"fields\":[{\"type\":\"string\",\"optional\":false,\"field\":\"version\"},{\"type\":\"string\",\"optional\":false,\"field\":\"connector\"},{\"type\":\"string\",\"optional\":false,\"field\":\"name\"},{\"type\":\"int64\",\"optional\":false,\"field\":\"ts_ms\"},{\"type\":\"string\",\"optional\":true,\"name\":\"io.debezium.data.Enum\",\"version\":1,\"parameters\":{\"allowed\":\"true,last,false\"},\"default\":\"false\",\"field\":\"snapshot\"},{\"type\":\"string\",\"optional\":false,\"field\":\"db\"},{\"type\":\"string\",\"optional\":false,\"field\":\"schema\"},{\"type\":\"string\",\"optional\":false,\"field\":\"table\"},{\"type\":\"int64\",\"optional\":true,\"field\":\"txId\"},{\"type\":\"int64\",\"optional\":true,\"field\":\"lsn\"},{\"type\":\"int64\",\"optional\":true,\"field\":\"xmin\"}],\"optional\":false,\"name\":\"io.debezium.connector.postgresql.Source\",\"field\":\"source\"},{\"type\":\"string\",\"optional\":false,\"field\":\"op\"},{\"type\":\"int64\",\"optional\":true,\"field\":\"ts_ms\"},{\"type\":\"struct\",\"fields\":[{\"type\":\"string\",\"optional\":false,\"field\":\"id\"},{\"type\":\"int64\",\"optional\":false,\"field\":\"total_order\"},{\"type\":\"int64\",\"optional\":false,\"field\":\"data_collection_order\"}],\"optional\":true,\"field\":\"transaction\"}],\"optional\":false,\"name\":\"P008_South_PG_PROD_19.cpzxdb.public.cpzx_drisk_dep.Envelope\"},\"payload\":{\"before\":null,\"after\":{\"depno\":\"RS202012110008\",\"riskcode\":\"ZEE\",\"oldriskcode\":\"ZEE\",\"riskcname\":\"环境污染责任保险\",\"riskscname\":\"\",\"risktname\":null,\"riskename\":\"\",\"risksename\":\"\",\"riskattribute\":\"1\",\"salearealevel\":\"01\",\"materialcontxt\":\"\",\"classcode\":\"10\",\"framecode\":null,\"reportno\":\"默认赋值\",\"projectcode\":\"            \",\"planind\":\"1\",\"accountlevel\":\"4\",\"reinslevel\":\" \",\"managementlevel\":\"2\",\"statlevel\":\" \",\"auditflag\":\"9\",\"agricultureflag\":\"3\",\"policyflag\":\"4\",\"policyprocessflag\":\"1\",\"isforce\":\"0\",\"requiredflag\":\"0\",\"validdate\":1607688000000,\"invaliddate\":null,\"validstatus\":\"1\",\"templatecode\":\"\",\"clienttype\":\"2\",\"configtype\":null,\"remark\":null,\"synflag\":\"2\",\"rateunit\":1000,\"shortrateflag\":null,\"classflag\":\"0\",\"riskflag\":\"1\",\"autopaymentflag\":\" \",\"updateflag\":\"1\",\"risklaunchdate\":\"\",\"risklaunchnum\":\"\",\"targetcustom\":\"\",\"riskprofile\":\"\",\"innovationlevel\":\"0\",\"restoreclasscode\":null,\"restoreriskcode\":null,\"isimpactflag\":\"0\",\"isfamilyamount\":\"0\",\"isdisclosure\":\"1\",\"nodisclosurereason\":null,\"mindiscount\":null,\"sexs\":null,\"tmaxage\":null,\"tminage\":null,\"bmaxage\":null,\"bminage\":null,\"creatorcode\":\"王彦飞\",\"updatercode\":\"13160255\",\"inserttimeforhis\":1607701978000,\"operatetimeforhis\":1607701978000,\"issecret\":null,\"tagetype\":null,\"bmaxagetype\":null,\"bminagetype\":null,\"riskno\":null,\"isapproval\":\"0\",\"relationriskcode\":null,\"relationrenewriskcode\":null,\"isfrenchguestmodel\":\"0\",\"clienttypepolicy\":null,\"isfinance\":null},\"source\":{\"version\":\"1.1.1.RELEASE-TBase\",\"connector\":\"postgresql\",\"name\":\"P008_South_PG_PROD_19.cpzxdb\",\"ts_ms\":1607673182612,\"snapshot\":\"false\",\"db\":\"cpzxdb\",\"schema\":\"public\",\"table\":\"cpzx_drisk_dep\",\"txId\":13257396,\"lsn\":609138708488,\"xmin\":null},\"op\":\"u\",\"ts_ms\":1607858747733,\"transaction\":null}}";
        JSONObject values = JSONObject.fromObject(json);
//        Iterator keys = values.keys();
//        while(keys.hasNext()){
//            String key = keys.next().toString();
//            System.out.println(key);
//            if(key == "schema"){
//                String value = values.get(key).toString();
//                System.out.println(value);
//            }
//        }
        //System.out.println(values.getString(1));
        //JSONObject jsonObject = JSONObject.fromObject(json);
        System.out.println(values.get("payload"));

    }
}
