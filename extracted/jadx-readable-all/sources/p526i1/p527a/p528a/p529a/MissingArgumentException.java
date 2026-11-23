package p526i1.p527a.p528a.p529a;

/* JADX INFO: renamed from: i1.a.a.a.g, reason: use source file name */
/* JADX INFO: compiled from: MissingArgumentException.java */
/* JADX INFO: loaded from: classes2.dex */
public class MissingArgumentException extends ParseException {
    public MissingArgumentException(String str) {
        super(str);
    }

    public MissingArgumentException(Option2 option2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Missing argument for option: ");
        stringBuffer.append(option2.m13802b());
        this(stringBuffer.toString());
    }
}
