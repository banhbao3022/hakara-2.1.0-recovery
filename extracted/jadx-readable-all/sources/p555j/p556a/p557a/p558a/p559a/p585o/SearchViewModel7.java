package p555j.p556a.p557a.p558a.p559a.p585o;

import java.util.ArrayList;
import java.util.List;
import mtp.media.karaoke.data.model.Keyword;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p609c.p611b.KeywordEntity;
import p555j.p556a.p557a.p606h.p614e.SearchRepository;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.o.n, reason: use source file name */
/* JADX INFO: compiled from: SearchViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SearchViewModel7 extends BaseViewModel {

    /* JADX INFO: renamed from: l */
    public final MutableLiveData<String> f31730l;

    /* JADX INFO: renamed from: m */
    public final MutableLiveData<ArrayList<Keyword>> f31731m;

    /* JADX INFO: renamed from: n */
    public final MutableLiveData<ArrayList<Keyword>> f31732n;

    /* JADX INFO: renamed from: o */
    public final MutableLiveData<List<KeywordEntity>> f31733o;

    /* JADX INFO: renamed from: p */
    public boolean f31734p;

    /* JADX INFO: renamed from: q */
    public final SearchRepository f31735q;

    public SearchViewModel7(SearchRepository searchRepository) {
        Intrinsics2.m13089e(searchRepository, "searchRepository");
        this.f31735q = searchRepository;
        this.f31730l = new MutableLiveData<>();
        this.f31731m = new MutableLiveData<>();
        this.f31732n = new MutableLiveData<>();
        this.f31733o = new MutableLiveData<>();
    }
}
