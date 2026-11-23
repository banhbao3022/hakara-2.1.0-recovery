package p007c.p190n.p438f.p448n.p450c;

import p007c.p190n.p438f.p448n.p449b.ErrorCorrectionLevel;
import p007c.p190n.p438f.p448n.p449b.Mode;
import p007c.p190n.p438f.p448n.p449b.Version;

/* JADX INFO: renamed from: c.n.f.n.c.e, reason: use source file name */
/* JADX INFO: compiled from: QRCode.java */
/* JADX INFO: loaded from: classes.dex */
public final class QRCode {

    /* JADX INFO: renamed from: a */
    public Mode f27807a;

    /* JADX INFO: renamed from: b */
    public ErrorCorrectionLevel f27808b;

    /* JADX INFO: renamed from: c */
    public Version f27809c;

    /* JADX INFO: renamed from: d */
    public int f27810d = -1;

    /* JADX INFO: renamed from: e */
    public ByteMatrix f27811e;

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f27807a);
        sb.append("\n ecLevel: ");
        sb.append(this.f27808b);
        sb.append("\n version: ");
        sb.append(this.f27809c);
        sb.append("\n maskPattern: ");
        sb.append(this.f27810d);
        if (this.f27811e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f27811e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
