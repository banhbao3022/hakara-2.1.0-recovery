package p007c.p190n.p194b.p266d.p314j.p315a;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2248b0;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.jt */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C3189jt extends AbstractC3679x0<String> {

    /* JADX INFO: renamed from: r */
    public final Object f15718r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC3239l5<String> f15719s;

    public C3189jt(int i, String str, InterfaceC3239l5<String> interfaceC3239l5, InterfaceC3275m4 interfaceC3275m4) {
        super(i, str, interfaceC3275m4);
        this.f15718r = new Object();
        this.f15719s = interfaceC3239l5;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3679x0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo4729x(String str) {
        InterfaceC3239l5<String> interfaceC3239l5;
        synchronized (this.f15718r) {
            interfaceC3239l5 = this.f15719s;
        }
        ((C2248b0) interfaceC3239l5).m7286a(str);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3679x0
    /* JADX INFO: renamed from: w */
    public final C3092h6<String> mo4728w(lv2 lv2Var) {
        String str;
        String str2;
        try {
            byte[] bArr = lv2Var.f16617b;
            Map<String, String> map = lv2Var.f16618c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = map.get(HttpHeaders.CONTENT_TYPE)) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i = 1; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(lv2Var.f16617b);
        }
        return new C3092h6<>(str, C2622l.m5460y0(lv2Var));
    }
}
