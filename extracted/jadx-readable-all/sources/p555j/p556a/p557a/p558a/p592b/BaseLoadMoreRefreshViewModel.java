package p555j.p556a.p557a.p558a.p592b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p483s.Collections4;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.p503c2.MainDispatchers;
import p555j.p556a.p557a.p558a.p596f.EndlessRecyclerOnScrollListener;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.b.r, reason: use source file name */
/* JADX INFO: compiled from: BaseLoadMoreRefreshViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseLoadMoreRefreshViewModel<Item> extends BaseViewModel {

    /* JADX INFO: renamed from: l */
    public final MutableLiveData<Boolean> f32029l;

    /* JADX INFO: renamed from: m */
    public final MutableLiveData<Boolean> f32030m;

    /* JADX INFO: renamed from: n */
    public final MutableLiveData<Integer> f32031n;

    /* JADX INFO: renamed from: o */
    public final MutableLiveData<Boolean> f32032o;

    /* JADX INFO: renamed from: p */
    public final EndlessRecyclerOnScrollListener f32033p;

    /* JADX INFO: renamed from: q */
    public final MutableLiveData<ArrayList<Item>> f32034q;

    /* JADX INFO: renamed from: r */
    public final MutableLiveData<Boolean> f32035r;

    /* JADX INFO: renamed from: j.a.a.a.b.r$a */
    /* JADX INFO: compiled from: BaseLoadMoreRefreshViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.base.BaseLoadMoreRefreshViewModel$onError$2", m13069f = "BaseLoadMoreRefreshViewModel.kt", m13070l = {147}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f32036j;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ Throwable f32038l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th, Continuation continuation) {
            super(2, continuation);
            this.f32038l = th;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return new a(this.f32038l, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return new a(this.f32038l, continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f32036j;
            if (i == 0) {
                C5729a.m12442O(obj);
                BaseLoadMoreRefreshViewModel baseLoadMoreRefreshViewModel = BaseLoadMoreRefreshViewModel.this;
                Throwable th = this.f32038l;
                this.f32036j = 1;
                if (BaseLoadMoreRefreshViewModel.super.mo13964m(th, this) == intrinsics) {
                    return intrinsics;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C5729a.m12442O(obj);
            }
            BaseLoadMoreRefreshViewModel baseLoadMoreRefreshViewModel2 = BaseLoadMoreRefreshViewModel.this;
            baseLoadMoreRefreshViewModel2.f32033p.f32063b = false;
            MutableLiveData<Boolean> mutableLiveData = baseLoadMoreRefreshViewModel2.f32029l;
            Boolean bool = Boolean.FALSE;
            mutableLiveData.mo427j(bool);
            BaseLoadMoreRefreshViewModel.this.f32030m.mo427j(bool);
            BaseLoadMoreRefreshViewModel.m13982o(BaseLoadMoreRefreshViewModel.this);
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.b.r$b */
    /* JADX INFO: compiled from: BaseLoadMoreRefreshViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.base.BaseLoadMoreRefreshViewModel$onLoadSuccess$2", m13069f = "BaseLoadMoreRefreshViewModel.kt", m13070l = {}, m13071m = "invokeSuspend")
    public static final class b extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ int f32040k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ List f32041l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, List list, Continuation continuation) {
            super(2, continuation);
            this.f32040k = i;
            this.f32041l = list;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return new b(this.f32040k, this.f32041l, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            b bVar = new b(this.f32040k, this.f32041l, continuation2);
            Unit unit = Unit.f29502a;
            bVar.mo6m(unit);
            return unit;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            ArrayList<Item> arrayListM421d;
            C5729a.m12442O(obj);
            BaseLoadMoreRefreshViewModel.this.f32031n.mo427j(new Integer(this.f32040k));
            Integer numM421d = BaseLoadMoreRefreshViewModel.this.f32031n.m421d();
            Objects.requireNonNull(BaseLoadMoreRefreshViewModel.this);
            if (numM421d != null && numM421d.intValue() == 1 && (arrayListM421d = BaseLoadMoreRefreshViewModel.this.f32034q.m421d()) != null) {
                arrayListM421d.clear();
            }
            if (Intrinsics2.m13085a(BaseLoadMoreRefreshViewModel.this.f32029l.m421d(), Boolean.TRUE)) {
                BaseLoadMoreRefreshViewModel baseLoadMoreRefreshViewModel = BaseLoadMoreRefreshViewModel.this;
                EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener = baseLoadMoreRefreshViewModel.f32033p;
                endlessRecyclerOnScrollListener.f32064c = 0;
                endlessRecyclerOnScrollListener.f32065d = 0;
                endlessRecyclerOnScrollListener.f32066e = 0;
                endlessRecyclerOnScrollListener.f32062a = 0;
                endlessRecyclerOnScrollListener.f32063b = true;
                baseLoadMoreRefreshViewModel.f32032o.mo427j(Boolean.FALSE);
            }
            ArrayList<Item> arrayListM421d2 = BaseLoadMoreRefreshViewModel.this.f32034q.m421d();
            if (arrayListM421d2 == null) {
                arrayListM421d2 = new ArrayList<>();
            }
            Collection<? extends Item> collection = this.f32041l;
            if (collection == null) {
                collection = Collections4.f29519f;
            }
            arrayListM421d2.addAll(collection);
            BaseLoadMoreRefreshViewModel.this.f32034q.mo427j(arrayListM421d2);
            MutableLiveData<Boolean> mutableLiveData = BaseLoadMoreRefreshViewModel.this.f32032o;
            List list = this.f32041l;
            mutableLiveData.mo427j(Boolean.valueOf((list != null ? new Integer(list.size()).intValue() : 0) < BaseLoadMoreRefreshViewModel.this.mo13906t()));
            MutableLiveData<Boolean> mutableLiveData2 = BaseLoadMoreRefreshViewModel.this.f31989c;
            Boolean bool = Boolean.FALSE;
            mutableLiveData2.mo427j(bool);
            BaseLoadMoreRefreshViewModel.this.f32029l.mo427j(bool);
            BaseLoadMoreRefreshViewModel.this.f32030m.mo427j(bool);
            BaseLoadMoreRefreshViewModel.m13982o(BaseLoadMoreRefreshViewModel.this);
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.b.r$c */
    /* JADX INFO: compiled from: BaseLoadMoreRefreshViewModel.kt */
    public static final class c extends EndlessRecyclerOnScrollListener {
        public c(int i) {
            super(i);
        }

        @Override // p555j.p556a.p557a.p558a.p596f.EndlessRecyclerOnScrollListener
        /* JADX INFO: renamed from: c */
        public void mo13987c() {
            BaseLoadMoreRefreshViewModel baseLoadMoreRefreshViewModel = BaseLoadMoreRefreshViewModel.this;
            Boolean boolM421d = baseLoadMoreRefreshViewModel.f31989c.m421d();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics2.m13085a(boolM421d, bool) || Intrinsics2.m13085a(baseLoadMoreRefreshViewModel.f32029l.m421d(), bool) || Intrinsics2.m13085a(baseLoadMoreRefreshViewModel.f32030m.m421d(), bool) || Intrinsics2.m13085a(baseLoadMoreRefreshViewModel.f32032o.m421d(), bool)) {
                return;
            }
            baseLoadMoreRefreshViewModel.f32030m.mo427j(bool);
            Integer numM421d = baseLoadMoreRefreshViewModel.f32031n.m421d();
            baseLoadMoreRefreshViewModel.mo13895u(numM421d != null ? 1 + numM421d.intValue() : 1);
        }
    }

    public BaseLoadMoreRefreshViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        Boolean bool = Boolean.FALSE;
        mutableLiveData.mo427j(bool);
        this.f32029l = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.mo427j(bool);
        this.f32030m = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.mo427j(0);
        this.f32031n = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        mutableLiveData4.mo427j(bool);
        this.f32032o = mutableLiveData4;
        this.f32033p = new c(mo13909s());
        this.f32034q = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        mutableLiveData5.mo427j(bool);
        this.f32035r = mutableLiveData5;
    }

    /* JADX INFO: renamed from: o */
    public static final void m13982o(BaseLoadMoreRefreshViewModel baseLoadMoreRefreshViewModel) {
        MutableLiveData<Boolean> mutableLiveData = baseLoadMoreRefreshViewModel.f32035r;
        ArrayList<Item> arrayListM421d = baseLoadMoreRefreshViewModel.f32034q.m421d();
        mutableLiveData.mo427j(Boolean.valueOf(arrayListM421d != null ? arrayListM421d.isEmpty() : true));
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseViewModel
    /* JADX INFO: renamed from: m */
    public Object mo13964m(Throwable th, Continuation<? super Unit> continuation) throws Throwable {
        CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
        Object objM12445R = C5729a.m12445R(MainDispatchers.f29666b, new a(th, null), continuation);
        return objM12445R == Intrinsics.COROUTINE_SUSPENDED ? objM12445R : Unit.f29502a;
    }

    /* JADX INFO: renamed from: q */
    public final void m13984q() {
        Boolean boolM421d = this.f31989c.m421d();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics2.m13085a(boolM421d, bool) || Intrinsics2.m13085a(this.f32029l.m421d(), bool)) {
            return;
        }
        this.f32029l.mo427j(bool);
        mo13895u(1);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX INFO: renamed from: r */
    public final void m13985r() {
        boolean z;
        Integer numM421d = this.f32031n.m421d();
        if (numM421d != null && numM421d.intValue() == 0) {
            ArrayList<Item> arrayListM421d = this.f32034q.m421d();
            if (arrayListM421d != null ? arrayListM421d.isEmpty() : true) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            m13965n();
            mo13895u(1);
        }
    }

    /* JADX INFO: renamed from: s */
    public int mo13909s() {
        return 6;
    }

    /* JADX INFO: renamed from: t */
    public int mo13906t() {
        return 15;
    }

    /* JADX INFO: renamed from: u */
    public abstract void mo13895u(int i);

    /* JADX INFO: renamed from: v */
    public final Object m13986v(int i, List<? extends Item> list, Continuation<? super Unit> continuation) throws Throwable {
        CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
        Object objM12445R = C5729a.m12445R(MainDispatchers.f29666b, new b(i, list, null), continuation);
        return objM12445R == Intrinsics.COROUTINE_SUSPENDED ? objM12445R : Unit.f29502a;
    }
}
