package string3;

public class WithoutString {
    public String withoutString(String base, String remove) {
        if (base.contains(remove)) {
            base = base.replaceAll(remove, "");
        }
        if (base.contains(remove.toUpperCase())) {
            base = base.replaceAll(remove.toUpperCase(), "");
        }
        if (base.contains(remove.toLowerCase())) {
            base = base.replaceAll(remove.toLowerCase(), "");
        }
        return base;
    }
}
