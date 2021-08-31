window.onload = function () {
    document.getElementById("btn-add").addEventListener("click", function () {
        var listDiv = document.getElementById("poll-answer-list");

        var divEl = document.createElement("div"); // <div></div>
        divEl.setAttribute("class", "poll-answer-item"); // <div class="poll-answer-item"></div>
        var inputEl = document.createElement("input");
        inputEl.setAttribute("type", "text");
        inputEl.setAttribute("name", "answer");
        var btnEl = document.createElement("button");
        btnEl.setAttribute("type", "button");
        btnEl.setAttribute("class", "button");
        btnEl.appendChild(document.createTextNode("삭제"));
        btnEl.addEventListener("click", function () {
            var parent = this.parentNode;
            listDiv.removeChild(parent);
        });


        divEl.appendChild(inputEl);
        divEl.appendChild(btnEl);

        listDiv.appendChild(divEl);

    });
};
