using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public interface IUserView<T> where T : User
{
    void sendOnConsole(List<T> list);
}