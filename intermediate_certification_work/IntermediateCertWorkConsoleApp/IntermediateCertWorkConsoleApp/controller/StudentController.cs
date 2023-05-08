using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public class StudentController : IRunnable
{
    public void run()
    {
        var studentView = new StudentView();
        studentView.sendOnConsole(StudentService.CreateStudents());
    }

}