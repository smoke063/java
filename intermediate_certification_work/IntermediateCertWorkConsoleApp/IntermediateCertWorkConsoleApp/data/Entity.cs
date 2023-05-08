using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


public class Entity
{

    protected Guid Id { get; set; }
    protected Entity()
    {
        Id = Guid.NewGuid();
    }
}

