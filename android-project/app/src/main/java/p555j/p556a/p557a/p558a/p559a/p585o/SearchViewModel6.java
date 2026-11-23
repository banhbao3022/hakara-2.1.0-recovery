package p555j.p556a.p557a.p558a.p559a.p585o;

import java.util.ArrayList;
import java.util.Objects;
import mtp.media.karaoke.data.model.Keyword;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p481d0.Strings5;
import p477d1.p481d0.StringsJVM;
import p477d1.p483s.Collections2;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Ref3;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.MainCoroutineDispatcher;
import p500e1.p501a.p503c2.MainDispatchers;
import p555j.p556a.p557a.p606h.p614e.SearchRepository;

/* JADX INFO: renamed from: j.a.a.a.a.o.m, reason: use source file name */
/* JADX INFO: compiled from: SearchViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.search.SearchViewModel$loadSuggestKeywords$1", m13069f = "SearchViewModel.kt", m13070l = {89, 90, 105}, m13071m = "invokeSuspend")
public final class SearchViewModel6 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public Object f31721j;

    /* JADX INFO: renamed from: k */
    public Object f31722k;

    /* JADX INFO: renamed from: l */
    public Object f31723l;

    /* JADX INFO: renamed from: m */
    public int f31724m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ SearchViewModel7 f31725n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ String f31726o;

    /* JADX INFO: renamed from: j.a.a.a.a.o.m$a */
    /* JADX INFO: compiled from: SearchViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.search.SearchViewModel$loadSuggestKeywords$1$1", m13069f = "SearchViewModel.kt", m13070l = {}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ Ref3 f31728k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ ArrayList f31729l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref3 ref3, ArrayList arrayList, Continuation continuation) {
            super(2, continuation);
            this.f31728k = ref3;
            this.f31729l = arrayList;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return SearchViewModel6.this.new a(this.f31728k, this.f31729l, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            a aVar = SearchViewModel6.this.new a(this.f31728k, this.f31729l, continuation2);
            Unit unit = Unit.f29502a;
            aVar.mo6m(unit);
            return unit;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            C5729a.m12442O(obj);
            Object obj2 = ((ArrayList) this.f31728k.f29604f).get(1);
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.ArrayList<*> /* = java.util.ArrayList<*> */");
            int i = 0;
            for (Object obj3 : (ArrayList) obj2) {
                int i2 = i + 1;
                if (i < 0) {
                    Collections2.m13041f();
                    throw null;
                }
                int iIntValue = new Integer(i).intValue();
                String string = Strings5.m13004G(StringsJVM.m12993j(obj3.toString(), "karaoke", "", false, 4)).toString();
                if (!StringsJVM.m12990g(string)) {
                    this.f31729l.add(new Keyword(iIntValue, string));
                }
                Intrinsics2.m13089e(string, "message");
                i = i2;
            }
            SearchViewModel6.this.f31725n.f31732n.mo427j(this.f31729l);
            return Unit.f29502a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel6(SearchViewModel7 searchViewModel7, String str, Continuation continuation) {
        super(2, continuation);
        this.f31725n = searchViewModel7;
        this.f31726o = str;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new SearchViewModel6(this.f31725n, this.f31726o, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new SearchViewModel6(this.f31725n, this.f31726o, continuation2).mo6m(Unit.f29502a);
    }

    /* JADX WARN: Type inference failed for: r14v9, types: [T, java.util.ArrayList] */
    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        ArrayList arrayList;
        Ref3 ref3;
        Ref3 ref4;
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31724m;
        try {
            if (i != 0) {
                if (i == 1) {
                    ref3 = (Ref3) this.f31723l;
                    ref4 = (Ref3) this.f31722k;
                    arrayList = (ArrayList) this.f31721j;
                    C5729a.m12442O(obj);
                } else {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C5729a.m12442O(obj);
                }
                return Unit.f29502a;
            }
            C5729a.m12442O(obj);
            arrayList = new ArrayList();
            ref3 = new Ref3();
            SearchRepository searchRepository = this.f31725n.f31735q;
            String str = "karaoke " + this.f31726o;
            this.f31721j = arrayList;
            this.f31722k = ref3;
            this.f31723l = ref3;
            this.f31724m = 1;
            obj = searchRepository.mo14215f(str, "firefox", "yt", "vi", this);
            if (obj == intrinsics) {
                return intrinsics;
            }
            ref4 = ref3;
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<*> /* = java.util.ArrayList<*> */");
            }
            ref3.f29604f = (ArrayList) obj;
            CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatchers.f29666b;
            a aVar = new a(ref4, arrayList, null);
            this.f31721j = null;
            this.f31722k = null;
            this.f31723l = null;
            this.f31724m = 2;
            if (C5729a.m12445R(mainCoroutineDispatcher, aVar, this) == intrinsics) {
                return intrinsics;
            }
            return Unit.f29502a;
        } catch (Exception e) {
            Intrinsics2.m13089e(String.valueOf(e.getMessage()), "message");
            SearchViewModel7 searchViewModel7 = this.f31725n;
            this.f31721j = null;
            this.f31722k = null;
            this.f31723l = null;
            this.f31724m = 3;
            if (searchViewModel7.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
    }
}
