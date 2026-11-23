package p636z0.p667e.p676b.p677v1.p678r1.p680c;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p693h.p694a.CallbackToFutureAdapter;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e.b.v1.r1.c.k, reason: use source file name */
/* JADX INFO: compiled from: ListFuture.java */
/* JADX INFO: loaded from: classes.dex */
public class ListFuture3 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f36294f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ListenableFuture f36295g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ListFuture f36296h;

    public ListFuture3(ListFuture listFuture, int i, ListenableFuture listenableFuture) {
        this.f36296h = listFuture;
        this.f36294f = i;
        this.f36295g = listenableFuture;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public void run() {
        List<V> list;
        CallbackToFutureAdapter callbackToFutureAdapter;
        ArrayList arrayList;
        List<V> list2;
        List<V> list3;
        List<V> list4;
        List<V> list5;
        ListFuture listFuture = this.f36296h;
        int i = this.f36294f;
        ListenableFuture listenableFuture = this.f36295g;
        List<V> list6 = listFuture.f36287g;
        if (listFuture.isDone() || list6 == 0) {
            C8162a.m16065j(listFuture.f36288h, "Future was done before all dependencies completed");
            return;
        }
        try {
            C8162a.m16065j(listenableFuture.isDone(), "Tried to set value from future which is not done");
            list6.set(i, (V) Futures2.m15427b(listenableFuture));
            int iDecrementAndGet = listFuture.f36289i.decrementAndGet();
            C8162a.m16065j(iDecrementAndGet >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet == 0) {
                if (list5 != 0) {
                    callbackToFutureAdapter = listFuture.f36291k;
                    arrayList = new ArrayList(list5);
                    callbackToFutureAdapter.m15659a(arrayList);
                }
            }
        } catch (Error e) {
            listFuture.f36291k.m15661c(e);
            int iDecrementAndGet2 = listFuture.f36289i.decrementAndGet();
            C8162a.m16065j(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet2 == 0) {
                if (list4 != 0) {
                    callbackToFutureAdapter = listFuture.f36291k;
                    arrayList = new ArrayList(list4);
                }
            }
        } catch (CancellationException unused) {
            if (listFuture.f36288h) {
                listFuture.cancel(false);
            }
            int iDecrementAndGet3 = listFuture.f36289i.decrementAndGet();
            C8162a.m16065j(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet3 == 0) {
                if (list3 != 0) {
                    callbackToFutureAdapter = listFuture.f36291k;
                    arrayList = new ArrayList(list3);
                }
            }
        } catch (RuntimeException e2) {
            if (listFuture.f36288h) {
                listFuture.f36291k.m15661c(e2);
            }
            int iDecrementAndGet4 = listFuture.f36289i.decrementAndGet();
            C8162a.m16065j(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet4 == 0) {
                if (list2 != 0) {
                    callbackToFutureAdapter = listFuture.f36291k;
                    arrayList = new ArrayList(list2);
                }
            }
        } catch (ExecutionException e3) {
            if (listFuture.f36288h) {
                listFuture.f36291k.m15661c(e3.getCause());
            }
            int iDecrementAndGet5 = listFuture.f36289i.decrementAndGet();
            C8162a.m16065j(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet5 == 0) {
                if (list != 0) {
                    callbackToFutureAdapter = listFuture.f36291k;
                    arrayList = new ArrayList(list);
                }
            }
        } finally {
            int iDecrementAndGet6 = listFuture.f36289i.decrementAndGet();
            C8162a.m16065j(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                List<V> list7 = listFuture.f36287g;
                if (list7 != 0) {
                    listFuture.f36291k.m15659a(new ArrayList(list7));
                } else {
                    C8162a.m16065j(listFuture.isDone(), null);
                }
            }
        }
    }
}
