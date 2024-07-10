<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
        var num = prompt("Enter a number: ")
        var n = parseInt(num)
        var i=1;
        var sum=0;
	    while(i<=n/2)
	    {
	       if(n%i==0)
	       {
		    sum+=i;
	       }
	      i++;
	    }
	if(sum==n)
	{
	console.log(n," is a perfect number");
               } 
	else
	console.log(n," is not a  perfect number");
    </script>
</head>
<body>
    
</body>
</html>
