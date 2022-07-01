<!DOCTYPE html>
<html>
<script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
<body>

<h2>Use HTTP POST to Get JSON Data from a PHP Server</h2>

<p id="demo"></p>
<div id="myPlot" style="width:100%;max-width:700px"></div>
<script>
const dbParam = JSON.stringify({"limit":10});
const xmlhttp = new XMLHttpRequest();
xmlhttp.onload = function() {
  const myObj = JSON.parse(this.responseText);
  let text = "";
  for (let x in myObj) {
    text += myObj[x].name + "<br>";
  }
  document.getElementById("demo").innerHTML = text;
}
xmlhttp.open("POST", "json_demo_db_post.php");
xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
xmlhttp.send("x=" + dbParam);
</script>
<script>
var xArray = [55, 49, 44, 24, 15];
var yArray = ["Italy ", "France ", "Spain ", "USA ", "Argentina "];

var data = [{
  x:xArray,
  y:yArray,
  type:"bar",
  orientation:"h",
  marker: {color:"rgba(255,0,0,0.6)"}
}];

var layout = {title:"World Wide Wine Production"};

Plotly.newPlot("myPlot", data, layout);
</script>
<p>Try changing the "limit" property from 10 to 5.</p>

</body>
</html>
