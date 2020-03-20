<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html 
	xmlns="http://www.w3.org/1999/xhtml"
	xmlns:composite="http://java.sun.com/jsf/composite"
	xmlsn:iu="http://java.sun.com/jsf/facelets"	
	xmlsn:f="http://java.sun.com/jsf/core"
	xmlsn:h="http://java.sun.com/jsf/html" 
>
<h:head>
    <title>Hello JSF!</title>
</h:head>
<h:body>
	 #{welcome.message}
     <p:panel header="Teste" style="width:50%">
        <p:button value="Teste">
    </p:button></p:panel>
</h:body>

</html>
