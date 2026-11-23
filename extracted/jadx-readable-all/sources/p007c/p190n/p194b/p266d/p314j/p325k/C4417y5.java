package p007c.p190n.p194b.p266d.p314j.p325k;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: c.n.b.d.j.k.y5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4417y5 implements InterfaceC4418y6 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4198i6 f23637a = new C4100b6();

    /* JADX INFO: renamed from: b */
    public final InterfaceC4198i6 f23638b;

    public C4417y5() {
        InterfaceC4198i6 interfaceC4198i6;
        InterfaceC4198i6[] interfaceC4198i6Arr = new InterfaceC4198i6[2];
        interfaceC4198i6Arr[0] = C4113c5.f23103a;
        try {
            interfaceC4198i6 = (InterfaceC4198i6) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC4198i6 = f23637a;
        }
        interfaceC4198i6Arr[1] = interfaceC4198i6;
        C4086a6 c4086a6 = new C4086a6(interfaceC4198i6Arr);
        Charset charset = C4127d5.f23112a;
        this.f23638b = c4086a6;
    }
}
