using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public class User : Entity
{
    public string FirstName { get; set; }
    public string SecondName { get; set; }
    public string Patronymic { get; set; }
    public DateTime DateOfBirth { get; set; }

    protected User(string firstName, string secondName, string patronymic, DateTime dateOfBirth) : base()
    {
        FirstName = firstName;
        SecondName = secondName;
        Patronymic = patronymic;
        DateOfBirth = dateOfBirth;
    }

    public override string ToString()
    {
        return "User " +
                "firstName = '" + FirstName + '\'' +
                ", secondName = '" + SecondName + '\'' +
                ", patronymic = '" + Patronymic + '\'' +
                ", dateOfBirth = " + DateOfBirth.ToString();

    }

    public override bool Equals(object? obj)
    {
        return obj is User user &&
               Id == user.Id &&
               FirstName == user.FirstName &&
               SecondName == user.SecondName &&
               Patronymic == user.Patronymic &&
               DateOfBirth == user.DateOfBirth;
    }

    public override int GetHashCode()
    {
        return HashCode.Combine(Id, FirstName, SecondName, Patronymic, DateOfBirth);
    }
}

