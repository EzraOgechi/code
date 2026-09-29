<!DOCTYPE html>
<html>
<body>
 <form method="POST" action="">
   Name: <input type="text" name="name" required><br>
   Email: <input type="email" name="email" required><br>
   <button type="submit">Submit</button>
 </form>

 <?php
 if ($_SERVER["REQUEST_METHOD"] == "POST") {
     // Trim and sanitize inputs
     $name = trim(htmlspecialchars($_POST['name']));
     $email = trim(htmlspecialchars($_POST['email']));

     // Validate inputs
     if (empty($name) || empty($email)) {
         echo "<p style='color:red;'>Error: All fields are required.</p>";
     } elseif (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
         echo "<p style='color:red;'>Error: Invalid email format.</p>";
     } else {
         // Display data
         echo "Name: $name<br>Email: $email";

         // Save to text file
         $data = "Name: $name | Email: $email\n";
         file_put_contents("userdata.txt", $data, FILE_APPEND);
         echo "<p style='color:green;'>Data saved successfully!</p>";
     }
 }
 ?>
</body>
</html>