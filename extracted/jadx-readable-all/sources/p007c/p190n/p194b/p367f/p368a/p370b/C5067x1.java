package p007c.p190n.p194b.p367f.p368a.p370b;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;

/* JADX INFO: renamed from: c.n.b.f.a.b.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5067x1 {

    /* JADX INFO: renamed from: a */
    public static final C5089f f26006a = new C5089f("VerifySliceTaskHandler");

    /* JADX INFO: renamed from: b */
    public final C5056u f26007b;

    public C5067x1(C5056u c5056u) {
        this.f26007b = c5056u;
    }

    /* JADX INFO: renamed from: a */
    public final void m11513a(C5064w1 c5064w1) {
        File fileM11495l = this.f26007b.m11495l(c5064w1.f26031b, c5064w1.f25992c, c5064w1.f25993d, c5064w1.f25994e);
        if (!fileM11495l.exists()) {
            throw new C5011i0(String.format("Cannot find unverified files for slice %s.", c5064w1.f25994e), c5064w1.f26030a);
        }
        try {
            File fileM11501r = this.f26007b.m11501r(c5064w1.f26031b, c5064w1.f25992c, c5064w1.f25993d, c5064w1.f25994e);
            if (!fileM11501r.exists()) {
                throw new C5011i0(String.format("Cannot find metadata files for slice %s.", c5064w1.f25994e), c5064w1.f26030a);
            }
            try {
                if (!C4799a.m10976a(C5061v1.m11505a(fileM11495l, fileM11501r)).equals(c5064w1.f25995f)) {
                    throw new C5011i0(String.format("Verification failed for slice %s.", c5064w1.f25994e), c5064w1.f26030a);
                }
                f26006a.m11533b(4, "Verification of slice %s of pack %s successful.", new Object[]{c5064w1.f25994e, c5064w1.f26031b});
                File fileM11496m = this.f26007b.m11496m(c5064w1.f26031b, c5064w1.f25992c, c5064w1.f25993d, c5064w1.f25994e);
                if (!fileM11496m.exists()) {
                    fileM11496m.mkdirs();
                }
                if (!fileM11495l.renameTo(fileM11496m)) {
                    throw new C5011i0(String.format("Failed to move slice %s after verification.", c5064w1.f25994e), c5064w1.f26030a);
                }
            } catch (IOException e) {
                throw new C5011i0(String.format("Could not digest file during verification for slice %s.", c5064w1.f25994e), e, c5064w1.f26030a);
            } catch (NoSuchAlgorithmException e2) {
                throw new C5011i0("SHA256 algorithm not supported.", e2, c5064w1.f26030a);
            }
        } catch (IOException e3) {
            throw new C5011i0(String.format("Could not reconstruct slice archive during verification for slice %s.", c5064w1.f25994e), e3, c5064w1.f26030a);
        }
    }
}
