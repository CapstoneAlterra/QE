<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>valid_create_class</name>
   <tag></tag>
   <elementGuidId>64939546-286f-436a-8217-6d89cfed65ae</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;class_category_id\&quot;:1,\n    \&quot;trainer_name\&quot;:\&quot;Sofyan\&quot;,\n    \&quot;name\&quot;:\&quot;Class testing\&quot;,\n    \&quot;description\&quot;:\&quot;Halos\&quot;,\n    \&quot;price\&quot;:10000,\n    \&quot;meet_link\&quot;:\&quot;http://google.com\&quot;,\n    \&quot;category\&quot;:\&quot;upper body\&quot;,\n    \&quot;image\&quot;:\&quot;http://google.com\&quot;,\n    \&quot;date\&quot;:\&quot;2022-06-18\&quot;,\n    \&quot;start_time\&quot;:\&quot;09:30:00\&quot;,\n    \&quot;end_time\&quot;:\&quot;11:00:00\&quot;,\n    \&quot;trainer_id\&quot;:3,\n    \&quot;is_offline\&quot;:false\n}&quot;,
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
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2NTgzNjc0MTgsImlhdCI6MTY1ODM2MDIxOCwiaWQiOjEsIm5hbWUiOiJBZG1pbiIsInJvbGUiOiJhZG1pbiIsInRva2VuX3R5cGUiOiJhY2Nlc3NfdG9rZW4ifQ.gjFqEhjwWYv3OMZSZe8Gwzpfl5lVGTzRMg8I5XBV9C0</value>
   </httpHeaderProperties>
   <katalonVersion>8.2.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://gym.stack.co.id/admin/class/create</restUrl>
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
