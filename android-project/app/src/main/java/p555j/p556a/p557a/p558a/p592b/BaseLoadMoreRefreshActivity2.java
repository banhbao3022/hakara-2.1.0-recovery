package p555j.p556a.p557a.p558a.p592b;

import java.util.ArrayList;
import p636z0.p759s.Observer;

/* JADX INFO: Add missing generic type declarations: [Item] */
/* JADX INFO: renamed from: j.a.a.a.b.m, reason: use source file name */
/* JADX INFO: compiled from: BaseLoadMoreRefreshActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BaseLoadMoreRefreshActivity2<T, Item> implements Observer<ArrayList<Item>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseLoadMoreRefreshActivity f32022a;

    public BaseLoadMoreRefreshActivity2(BaseLoadMoreRefreshActivity baseLoadMoreRefreshActivity) {
        this.f32022a = baseLoadMoreRefreshActivity;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(Object obj) {
        this.f32022a.mo13980W().m13977p((ArrayList) obj);
    }
}
