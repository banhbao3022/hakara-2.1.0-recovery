package p477d1.p489v.p491d;

import p477d1.p489v.p490c.JDK7PlatformImplementations;
import p477d1.p498z.Random;
import p477d1.p498z.p499d.PlatformThreadLocalRandom;

/* JADX INFO: renamed from: d1.v.d.a, reason: use source file name */
/* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
/* JADX INFO: loaded from: classes.dex */
public class JDK8PlatformImplementations extends JDK7PlatformImplementations {
    @Override // p477d1.p489v.PlatformImplementations
    /* JADX INFO: renamed from: b */
    public Random mo13075b() {
        return new PlatformThreadLocalRandom();
    }
}
