package p526i1.p527a.p528a.p529a;

/* JADX INFO: renamed from: i1.a.a.a.a, reason: use source file name */
/* JADX INFO: compiled from: AlreadySelectedException.java */
/* JADX INFO: loaded from: classes2.dex */
public class AlreadySelectedException extends ParseException {
    public AlreadySelectedException(String str) {
        super(str);
    }

    public AlreadySelectedException(OptionGroup optionGroup, Option2 option2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("The option '");
        stringBuffer.append(option2.m13802b());
        stringBuffer.append("' was specified but an option from this group ");
        stringBuffer.append("has already been selected: '");
        stringBuffer.append(optionGroup.f30785g);
        stringBuffer.append("'");
        this(stringBuffer.toString());
    }
}
