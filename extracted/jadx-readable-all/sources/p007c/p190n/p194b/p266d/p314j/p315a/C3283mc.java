package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: c.n.b.d.j.a.mc */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3283mc {

    /* JADX INFO: renamed from: a */
    public final Map<String, List<AbstractC3679x0<?>>> f16713a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final fm2 f16714b;

    /* JADX INFO: renamed from: c */
    public final BlockingQueue<AbstractC3679x0<?>> f16715c;

    /* JADX INFO: renamed from: d */
    public final vq2 f16716d;

    /* JADX WARN: Multi-variable type inference failed */
    public C3283mc(fm2 fm2Var, fm2 fm2Var2, BlockingQueue<AbstractC3679x0<?>> blockingQueue, vq2 vq2Var) {
        this.f16716d = blockingQueue;
        this.f16714b = fm2Var;
        this.f16715c = fm2Var2;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m7688a(AbstractC3679x0<?> abstractC3679x0) {
        String strM8705l = abstractC3679x0.m8705l();
        List<AbstractC3679x0<?>> listRemove = this.f16713a.remove(strM8705l);
        if (listRemove == null || listRemove.isEmpty()) {
            return;
        }
        if (C3282mb.f16709a) {
            C3282mb.m7680a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), strM8705l);
        }
        AbstractC3679x0<?> abstractC3679x0Remove = listRemove.remove(0);
        this.f16713a.put(strM8705l, listRemove);
        synchronized (abstractC3679x0Remove.f21407j) {
            abstractC3679x0Remove.f21413p = this;
        }
        try {
            this.f16715c.put(abstractC3679x0Remove);
        } catch (InterruptedException e) {
            C3282mb.m7682c("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            fm2 fm2Var = this.f16714b;
            fm2Var.f14063j = true;
            fm2Var.interrupt();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m7689b(AbstractC3679x0<?> abstractC3679x0) {
        String strM8705l = abstractC3679x0.m8705l();
        if (!this.f16713a.containsKey(strM8705l)) {
            this.f16713a.put(strM8705l, null);
            synchronized (abstractC3679x0.f21407j) {
                abstractC3679x0.f21413p = this;
            }
            if (C3282mb.f16709a) {
                C3282mb.m7681b("new request, sending to network %s", strM8705l);
            }
            return false;
        }
        List<AbstractC3679x0<?>> arrayList = this.f16713a.get(strM8705l);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        abstractC3679x0.m8702f("waiting-for-response");
        arrayList.add(abstractC3679x0);
        this.f16713a.put(strM8705l, arrayList);
        if (C3282mb.f16709a) {
            C3282mb.m7681b("Request for cacheKey=%s is in flight, putting on hold.", strM8705l);
        }
        return true;
    }
}
