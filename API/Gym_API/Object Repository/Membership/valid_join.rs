<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>valid_join</name>
   <tag></tag>
   <elementGuidId>806946db-fa34-4181-a529-faaad280da98</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;member_type_id\&quot;:1,\n    \&quot;start_at\&quot;:\&quot;2022-06-18\&quot;,\n    \&quot;nik\&quot;:\&quot;350919191806999003\&quot;,\n    \&quot;name\&quot;:\&quot;Abdul Kholiq\&quot;,\n    \&quot;gender\&quot;:\&quot;L\&quot;,\n    \&quot;address\&quot;:\&quot;jln ahmad yani 6 jember\&quot;,\n    \&quot;city\&quot;:\&quot;jember\&quot;,\n    \&quot;postal_code\&quot;:\&quot;680137\&quot;,\n    \&quot;email\&quot;:\&quot;kholiqdev@email.com\&quot;,\n    \&quot;phone\&quot;:\&quot;0896475830303\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2NTgzNzIwMDAsImlhdCI6MTY1ODM2NDgwMCwiaWQiOjEsIm5hbWUiOiJBYmR1bCBLaG9saXEiLCJyb2xlIjoibWVtYmVyIiwidG9rZW5fdHlwZSI6ImFjY2Vzc190b2tlbiJ9.VxMc7FI8QHSpgJAvnZhXBdDsnseiQO8SSIlSn2Gtx2o</value>
   </httpHeaderProperties>
   <katalonVersion>8.2.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://gym.stack.co.id/member/join</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
