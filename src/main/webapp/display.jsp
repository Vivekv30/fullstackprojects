<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>display</title>
    <link rel="stylesheet" href="./parkingnavbar.css">
    <link rel="stylesheet" href="./display.css">    
</head>
<body>
    <nav>
        <h1><span class="one" style="color: rgb(21, 133, 137);">Yashwanth</span> 
            <span class="two" style="color: rgb(199, 131, 20);">Parking</span>   Space</h1>
            <ul>
                <li><a href="Home">Home</a></li>
                <li><a href="checkin">CheckIn</a></li>
                <li><a href="checkout">CheckOut</a></li>
                <li><a href="display">Display</a></li>
            </ul>
    </nav>
    <section>
        <div class="aside">
            <a href="">Login</a>
            <a href="">cost</a>
        </div>
            <div class="displaysection">
                <form action="get">
                    <input type="text" name="id" placeholder="   enter id">
                    <input class="rrr" type="submit">
                </form>
                <table>
                    <thead>
                       <th>Id</th>
                       <th>VehicleNo</th>
                       <th>VehicleType</th>
                       <th>VehicleModel</th>
                       <th>MobileNo</th>
                       <th>CustomerName</th>
                       <th>CheckInTime</th>
                    </thead>
                    <tbody>
                        <td>${id}</td>
                       <td>${vNo}</td>
                       <td>${vType}</td>
                       <td>${vModel}</td>
                       <td>${mobileno}</td>
                       <td>${customername}</td>
                       <td>${checkintime}</td>
                        
                    </tbody>
                </table>
            </div>
    </section>
    
</body>
</html>