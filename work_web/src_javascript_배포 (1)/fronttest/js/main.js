window.onload = function () {
    var question = localStorage.getItem("question");
    var pollBtnDiv = document.querySelector(".content-left-poll-btn");
    var pollDiv = document.querySelector(".content-left-poll");

    if (question) { //질문이 있다면.
        
    } else {
        var poll = "진행중인 투표가 없습니다.";
        pollDiv.innerHTML = poll;
        pollBtnDiv.style.display = "";
        pollDiv.style.display = "";
        
    }

    document.getElementById("btn-makepoll").onclick = function () {
        window.open("./makepoll.html", "mp", "width=400, height=500, top=200, left=300");
    }
};
