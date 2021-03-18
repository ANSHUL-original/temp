var myJsonRequest;
if(myJsonRequest){
	myJsonRequest=new XMLHttpRequest;
}
function getAll(){
	$.ajax({
		url:"[[$(@environment.getProperty('api.base.path')}]]/Student/list)"
	})
}
