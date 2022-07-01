<?php
$servername = "localhost";
$username ="root";
$password = "m8AL5wuL";
$dbname = "myDB1";
$ids =array(1,2,3);
$names =array(1,2,3);
$i=0;
// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}

$sql = "SELECT id, firstname, lastname FROM MyGuests";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
  // output data of each row
  while($row = $result->fetch_assoc()) {
    echo "id: " . $row["id"]. " - Name: " . $row["firstname"]. " " . $row["lastname"]. "<br>";
  $ids[$i]=$row["id"];
  $names[$i]=$row["firstname"];
  $i++;
  }
} else {
  echo "0 results";
}
echo $ids[1];
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
	/*array("label"=> "April", "y"=> $purchased[3]),
	array("label"=> "May", "y"=> $purchased[4]),
	array("label"=> "Jun", "y"=> $purchased[5]),
	array("label"=> "July", "y"=> $purchased[6]),
	array("label"=> "Aug", "y"=> $purchased[7]),
	array("label"=> "Sep", "y"=> $purchased[8]),
	array("label"=> "Oct", "y"=> $purchased[9]),
	array("label"=> "Nov", "y"=> $purchased[10]),
	array("label"=> "Dec", "y"=> $purchased[11])*/
);

// Data to draw graph for sold products
$dataPoints2 = array(
	array("label"=> "Jan", "y"=> $names[0]),
	array("label"=> "Feb", "y"=> $names[1]),
	array("label"=> "March", "y"=> $names[2]),
	/*array("label"=> "April", "y"=> $sold[3]),
	array("label"=> "May", "y"=> $sold[4]),
	array("label"=> "Jun", "y"=> $sold[5]),
	array("label"=> "July", "y"=> $sold[6]),
	array("label"=> "Aug", "y"=> $sold[7]),
	array("label"=> "Sep", "y"=> $sold[8]),
	array("label"=> "Oct", "y"=> $sold[9]),
	array("label"=> "Nov", "y"=> $sold[10]),
	array("label"=> "Dec", "y"=> $sold[11])*/
);
	
?>

<!DOCTYPE HTML>
<html>
<head>
	<script src="https://canvasjs.com/assets/script/canvasjs.min.js">
	</script>
	<script>
		window.onload = function () {
		
			var chart = new CanvasJS.Chart("chartContainer", {
				animationEnabled: true,
				title:{
					text: "Monthly Purchased and Sold Product"
				},	
				axisY: {
					title: "Purchased",
					titleFontColor: "#4F81BC",
					lineColor: "#4F81BC",
					labelFontColor: "#4F81BC",
					tickColor: "#4F81BC"
				},
				axisY2: {
					title: "Sold",
					titleFontColor: "#C0504E",
					lineColor: "#C0504E",
					labelFontColor: "#C0504E",
					tickColor: "#C0504E"
				},	
				toolTip: {
					shared: true
				},
				legend: {
					cursor:"pointer",
					itemclick: toggleDataSeries
				},
				data: [{
					type: "column",
					name: "Purchased",
					legendText: "Purchased",
					showInLegend: true,
					dataPoints:<?php echo json_encode($dataPoints,
							JSON_NUMERIC_CHECK); ?>
				},
				{
					type: "column",	
					name: "Sold",
					legendText: "Sold",
					axisYType: "secondary",
					showInLegend: true,
					dataPoints:<?php echo json_encode($dataPoints2,
							JSON_NUMERIC_CHECK); ?>
				}]
			});
			chart.render();
			
			function toggleDataSeries(e) {
				if (typeof(e.dataSeries.visible) === "undefined"
							|| e.dataSeries.visible) {
					e.dataSeries.visible = false;
				}
				else {
					e.dataSeries.visible = true;
				}
				chart.render();
			}
		
		}
	</script>
</head>

<body>
	<div id="chartContainer" style="height: 300px; width: 100%;"></div>
</body>
</html>
