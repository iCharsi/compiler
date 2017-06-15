package pascal;


public class Variable
{
    private final Integer id;
    private final String type;


    public Variable(final Integer id, final String type)
    {
        this.id = id;
        this.type = type;
    }


    public Integer getId()
    {
        return id;
    }


    public String getType()
    {
        return type;
    }
}
