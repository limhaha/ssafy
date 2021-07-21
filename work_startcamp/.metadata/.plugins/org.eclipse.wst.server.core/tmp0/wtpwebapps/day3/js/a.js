
let a = 10;
console.log(a, 'ssafy');
function m1() {
	console.log('m1 call');
	alert('확인')
}

let cnt = 1;
let m2 = function() { //이름이 없는 함수 
	//console.log('aaaa');
	//let obj = document.getElementById('aaa');
	let obj = document.querySelector('#aaa');
	cnt++;
	obj.innerText = '변경된 문자열' + cnt;
	obj.style.color = 'red';
	console.log(obj.innerText);
}