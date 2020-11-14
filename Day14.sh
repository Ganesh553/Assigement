echo "First name validation"
echo -p "Enter You First name => "
read Firstname
n1=${#Firstname}
echo $n1
if [[ $n1 -gt 3 && "$Firstname" =~ ^[A-Z] ]]
then
echo "valid $Firstname"
else
echo "not valid $Firstname"
fi

echo "Last name validation"
echo -p "Enter You Last Name=> "
read Lastname
n2=${#Lastname}
echo $n2
if [[ $n2 -gt 3 && "$Lastname" =~ ^[A-Z] ]]
then
echo "valid $Lastname"
else
echo "not valid $Lastname"
fi

echo "Mail validation"
echo "enter mailid"
read email
if [[ "$email" =~ ^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,4}$ ]]
then
    echo "Email address $email is valid."
else
    echo "Email address $email is invalid."
fi

echo "Phon number validation"
echo "Enter Phone number"
read num
n=${#num}
echo $n
if [[ $n == 10 ]]
then
echo "91 $num vaild phone number"
else
echo "$num is less or greater then 10 digit so not valid"
fi

echo -p"enter password => "
read pass
n=${#pass}
echo $n
if [[ $n -gt 8 ]];
then
echo "valid"
else
echo "$pass less than or greater than 8"
fi
if [[ $pass == *[a-zA-Z]* && $pass == *[$@*#%^]* && $pass == *[0-9]* ]]
then
echo "$pass is valid password"
else
echo "It may not contail Uppercas or numberic or special character"
fi
