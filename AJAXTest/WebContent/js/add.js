

function callServer(){
	// javascript로 서버쪽 프로그램을 호출
	// ajax를 이용해서 처리해 보아요
	// 순수 javascript가 아닌 jQuery로 ajax이용
	$.ajax({
		//url : 호출할 서버쪽 프로그램의 url
		url : "http://localhost:8080/ajax/add",
		//type : 전송 방식 지칭
		type : "get",
		//data : 서버로 전송할 데이터 지칭
		data : {
			first : $("#first").val(),
			second : $("#second").val()
		},
		success : function(data){
			$("span").text(data)
		},
		error : function(){
			alert("something wrong!");
		}
	});
	//선택하는게 아닌 서버쪽 프로그램을 호출하기때문에 ()안함
}