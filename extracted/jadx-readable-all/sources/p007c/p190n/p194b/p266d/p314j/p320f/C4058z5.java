package p007c.p190n.p194b.p266d.p314j.p320f;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: c.n.b.d.j.f.z5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4058z5 implements InterfaceC4050y6 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3905j6 f23005a = new C4049y5();

    /* JADX INFO: renamed from: b */
    public final InterfaceC3905j6 f23006b;

    public C4058z5() {
        InterfaceC3905j6 interfaceC3905j6;
        InterfaceC3905j6[] interfaceC3905j6Arr = new InterfaceC3905j6[2];
        interfaceC3905j6Arr[0] = C4039x4.f22986a;
        try {
            interfaceC3905j6 = (InterfaceC3905j6) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC3905j6 = f23005a;
        }
        interfaceC3905j6Arr[1] = interfaceC3905j6;
        C3825b6 c3825b6 = new C3825b6(interfaceC3905j6Arr);
        Charset charset = C3814a5.f22506a;
        this.f23006b = c3825b6;
    }
}
