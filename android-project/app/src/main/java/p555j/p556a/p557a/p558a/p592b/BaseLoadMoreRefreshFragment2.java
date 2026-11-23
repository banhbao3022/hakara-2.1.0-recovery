package p555j.p556a.p557a.p558a.p592b;

import java.util.ArrayList;
import p636z0.p759s.Observer;

/* JADX INFO: Add missing generic type declarations: [Item] */
/* JADX INFO: renamed from: j.a.a.a.b.p, reason: use source file name */
/* JADX INFO: compiled from: BaseLoadMoreRefreshFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BaseLoadMoreRefreshFragment2<T, Item> implements Observer<ArrayList<Item>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseLoadMoreRefreshFragment f32027a;

    public BaseLoadMoreRefreshFragment2(BaseLoadMoreRefreshFragment baseLoadMoreRefreshFragment) {
        this.f32027a = baseLoadMoreRefreshFragment;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(Object obj) {
        this.f32027a.mo13892e1().m13977p((ArrayList) obj);
    }
}
