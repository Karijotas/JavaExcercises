package lt.techin.mantaspovilas.websitebuilder;

public class WebsiteBuilder {

    private  String name;
    private Type type;
    public WebsiteBuilder name(String name){
        this.name = name;
        return this;
    }
    public WebsiteBuilder type(String type){
        this.type = Type.valueOf(type);
        return this;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Website build(){ return new Website(this);}
    }


