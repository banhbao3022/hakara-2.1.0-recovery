package p007c.p190n.p385d.p429x;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: c.n.d.x.c, reason: use source file name */
/* JADX INFO: compiled from: DefaultUserAgentPublisher.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultUserAgentPublisher2 implements UserAgentPublisher {

    /* JADX INFO: renamed from: a */
    public final String f27307a;

    /* JADX INFO: renamed from: b */
    public final GlobalLibraryVersionRegistrar f27308b;

    public DefaultUserAgentPublisher2(Set<LibraryVersion> set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.f27307a = m12209b(set);
        this.f27308b = globalLibraryVersionRegistrar;
    }

    /* JADX INFO: renamed from: b */
    public static String m12209b(Set<LibraryVersion> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<LibraryVersion> it = set.iterator();
        while (it.hasNext()) {
            LibraryVersion next = it.next();
            sb.append(next.mo12207a());
            sb.append('/');
            sb.append(next.mo12208b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // p007c.p190n.p385d.p429x.UserAgentPublisher
    /* JADX INFO: renamed from: a */
    public String mo12210a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = this.f27308b;
        synchronized (globalLibraryVersionRegistrar.f27310b) {
            setUnmodifiableSet = Collections.unmodifiableSet(globalLibraryVersionRegistrar.f27310b);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return this.f27307a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27307a);
        sb.append(' ');
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar2 = this.f27308b;
        synchronized (globalLibraryVersionRegistrar2.f27310b) {
            setUnmodifiableSet2 = Collections.unmodifiableSet(globalLibraryVersionRegistrar2.f27310b);
        }
        sb.append(m12209b(setUnmodifiableSet2));
        return sb.toString();
    }
}
