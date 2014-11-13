package kata4;

public interface AttributeExtractor <Entity, Attribute>{

    public Attribute extract(Entity entity);

}
