var generateButton = document.getElementById('generate');
var min = document.getElementById('min');
var max = document.getElementById('max');
var selectedRadio = document.getElementsByName('op');
var result = document.getElementById('question');

function click() {
    var minValue = min.value;
    var maxValue = max.value;
    var selected = "add"
    selectedRadio.forEach(function (radio) {
        if (radio.checked) {
            selected = radio.value;
        }
    });
    switch (selected) {
        case "add":
            fetchAdd(minValue, maxValue);
            break;
        case "sub":
            fetchSub(minValue, maxValue);
            break;
        case "mul":
            fetchMul(minValue, maxValue);
            break;
        case "div":
            fetchDiv(minValue, maxValue);
            break;
        default:
            fetchAdd(minValue, maxValue);
            break;
    }
}

generateButton.onclick = click;

const BASE_API_URL = "https://agenerator.herokuapp.com/api/math";

const fetchAdd = (min, max) => {
    var url = BASE_API_URL + "/add";
    if (min != "") {
        url += "?min=" + min;
    }
    if (max != "") {
        url += "&max=" + max;
    }
    fetch(url)
        .then(response => response.json())
        .then(data => {
            result.textContent = JSON.stringify(data, undefined, 4);
        })
        .catch(error => {
            console.log(error);
        });
}
const fetchSub = (min, max) => {
    var url = BASE_API_URL + "/subs";
    if (min != "") {
        url += "?min=" + min;
    }
    if (max != "") {
        url += "&max=" + max;
    }
    fetch(url)
        .then(response => response.json())
        .then(data => {
            result.textContent = JSON.stringify(data, undefined, 4);
        })
        .catch(error => {
            console.log(error);
        })
}
const fetchMul = (min, max) => {
    var url = BASE_API_URL + "/multiply";
    if (min != "") {
        url += "?min=" + min;
    }
    if (max != "") {
        url += "&max=" + max;
    }
    fetch(url)
        .then(response => response.json())
        .then(data => {
            result.textContent = JSON.stringify(data, undefined, 4);
        })
        .catch(error => {
            console.log(error);
        })

}
const fetchDiv = (min, max) => {
    var url = BASE_API_URL + "/div";
    if (min != "") {
        url += "?min=" + min;
    }
    if (max != "") {
        url += "&max=" + max;
    }
    fetch(url)
        .then(response => response.json())
        .then(data => {
            result.textContent = JSON.stringify(data, undefined, 4);
        })
        .catch(error => {
            console.log(error);
        })
}
