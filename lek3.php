<?php
$servername = "HUN-PROD-DB-SV";
$username ="root";
$password = "";
$dbname = "master";
$ids =array();
$names =array();
$i=0;
// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}

$sql = "SELECT x, y FROM coords";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
  // output data of each row
  while($row = $result->fetch_assoc()) {
    echo "id: " . $row["x"]. " - Name: " . $row["y"]. " " . "<br>";
  $ids[$i]=$row["x"];
  $names[$i]=$row["y"];
  $i++;
  }
} else {
  echo "0 results";
}
echo $ids[2];
//$ids[0]=1.0;
//$names[0]=2.0;
$conn->close();
//chart


// First array for purchased product
$purchased= array(10, 15, 19, 0, 5, 7, 0, 0, 12, 13, 10, 1);

// Second array for sold product
$sold= array(7, 12, 14, 0, 3, 7, 0, 0, 10, 7, 5, 0);

// Data to draw graph for purchased products
$dataPoints = array(
	array("label"=> "Jan", "y"=> $ids[0]),
	array("label"=> "Feb", "y"=> $ids[1]),
	array("label"=> "March", "y"=> $ids[2]),
	array("label"=> "April", "y"=> $purchased[3]),
	array("label"=> "May", "y"=> $purchased[4]),
	array("label"=> "Jun", "y"=> $purchased[5]),
	array("label"=> "July", "y"=> $purchased[6]),
	array("label"=> "Aug", "y"=> $purchased[7]),
	array("label"=> "Sep", "y"=> $purchased[8]),
	array("label"=> "Oct", "y"=> $purchased[9]),
	array("label"=> "Nov", "y"=> $purchased[10]),
	array("label"=> "Dec", "y"=> $purchased[11])
);

// Data to draw graph for sold products
$dataPoints2 = array(
	array("label"=> "Jan", "y"=> $names[0]),
	array("label"=> "Feb", "y"=> $names[1]),
	array("label"=> "March", "y"=> $names[2]),
	array("label"=> "April", "y"=> $sold[3]),
	array("label"=> "May", "y"=> $sold[4]),
	array("label"=> "Jun", "y"=> $sold[5]),
	array("label"=> "July", "y"=> $sold[6]),
	array("label"=> "Aug", "y"=> $sold[7]),
	array("label"=> "Sep", "y"=> $sold[8]),
	array("label"=> "Oct", "y"=> $sold[9]),
	array("label"=> "Nov", "y"=> $sold[10]),
	array("label"=> "Dec", "y"=> $sold[11])
);
	
?>
<!DOCTYPE HTML>
<html>
<head>
<script>
window.onload = function () {
	
var chart = new CanvasJS.Chart("chartContainer", {
	animationEnabled: true,
	title: {
		text: "Military Expenditure of Countries: 2016"
	},
	axisX: {
		interval: 1
	},
	axisY: {
		title: "Expenses in Billion Dollars",
		includeZero: true,
		scaleBreaks: {
			type: "wavy",
			customBreaks: [{
				startValue: 80,
				endValue: 210
				},
				{
					startValue: 230,
					endValue: 600
				}
		]}
		
	},
	data: [{
		type: "bar",
		toolTipContent: "<img src=\"https://canvasjs.com/wp-content/uploads/images/gallery/javascript-column-bar-charts/\"{url}\"\" style=\"width:40px; height:20px;\"> <b>{label}</b><br>Budget: ${y}bn<br>{gdp}% of GDP",
		dataPoints: [
			

			{ label: "Australia", y: <?php echo json_encode($ids[2],
							JSON_NUMERIC_CHECK); ?>, gdp: <?php echo json_encode($ids[2],
							JSON_NUMERIC_CHECK); ?>, url: "australia.png" },
			{ label: "South Korea", y: 36.8, gdp: 2.7, url: "skorea.png" },
			{ label: "Germany", y: 41.1, gdp: 1.2, url: "germany.png" },
			{ label: "Japan", y: 46.1, gdp: 1.0, url: "japan.png" },
			{ label: "United Kingdom", y: 48.3, gdp: 1.9, url: "uk.png" },
			{ label: "India", y: 55.9, gdp: 2.5, url: "india.png" },
			{ label: "Russia", y: 69.2, gdp: 5.3, url: "russia.png" },
			{ label: "China", y: 215.7, gdp: 1.9, url: "china.png" },
			{ label: "United States", y: 611.2, gdp: 3.3, url: "us.png" }
		]
	}]
});
chart.render();

}
</script>
<meta http-equiv="refresh" content="10">
</head>
<body>
<div id="chartContainer" style="height: 300px; width: 100%;"></div>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
</body>
</html>
