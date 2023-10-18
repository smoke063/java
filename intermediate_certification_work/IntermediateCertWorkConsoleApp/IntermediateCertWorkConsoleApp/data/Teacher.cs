using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


public class Teacher : User
{
    public Teacher(string firstName, string secondName, string patronymic, DateTime dateOfBirth) : base(firstName, secondName, patronymic, dateOfBirth)
    {

    }

    public override bool Equals(object? obj)
    {
        return base.Equals(obj);
    }

    public override int GetHashCode()
    {
        return base.GetHashCode();
    }

    public override string ToString()
    {
        return base.ToString();
    }
}

