package p555j.p556a.p557a.p558a.p559a.p571g;

import mtp.media.karaoke.data.model.Comment;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.MainCoroutineDispatcher;
import p500e1.p501a.p503c2.MainDispatchers;
import p555j.p556a.p557a.p606h.p614e.CommentRepository;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.g.c, reason: use source file name */
/* JADX INFO: compiled from: CommentViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.comment.CommentViewModel$addComment$1", m13069f = "CommentViewModel.kt", m13070l = {50, 60}, m13071m = "invokeSuspend")
public final class CommentViewModel extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31333j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ CommentViewModel3 f31334k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f31335l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ String f31336m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ String f31337n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Integer f31338o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Integer f31339p;

    /* JADX INFO: renamed from: j.a.a.a.a.g.c$a */
    /* JADX INFO: compiled from: CommentViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.comment.CommentViewModel$addComment$1$1", m13069f = "CommentViewModel.kt", m13070l = {56}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f31340j;

        /* JADX INFO: renamed from: k */
        public int f31341k;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return CommentViewModel.this.new a(continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return CommentViewModel.this.new a(continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            MutableLiveData mutableLiveData;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31341k;
            if (i == 0) {
                C5729a.m12442O(obj);
                CommentViewModel commentViewModel = CommentViewModel.this;
                CommentViewModel3 commentViewModel3 = commentViewModel.f31334k;
                MutableLiveData<Comment> mutableLiveData2 = commentViewModel3.f31348u;
                CommentRepository commentRepository = commentViewModel3.f31349v;
                int i2 = commentViewModel.f31335l;
                String str = commentViewModel.f31336m;
                String str2 = commentViewModel.f31337n;
                Integer num = commentViewModel.f31338o;
                Integer num2 = commentViewModel.f31339p;
                this.f31340j = mutableLiveData2;
                this.f31341k = 1;
                obj = commentRepository.mo14176k(i2, str, str2, num, num2, this);
                if (obj == intrinsics) {
                    return intrinsics;
                }
                mutableLiveData = mutableLiveData2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.f31340j;
                C5729a.m12442O(obj);
            }
            mutableLiveData.mo427j(((GetItemResponse) obj).getResults());
            return Unit.f29502a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentViewModel(CommentViewModel3 commentViewModel3, int i, String str, String str2, Integer num, Integer num2, Continuation continuation) {
        super(2, continuation);
        this.f31334k = commentViewModel3;
        this.f31335l = i;
        this.f31336m = str;
        this.f31337n = str2;
        this.f31338o = num;
        this.f31339p = num2;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new CommentViewModel(this.f31334k, this.f31335l, this.f31336m, this.f31337n, this.f31338o, this.f31339p, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CommentViewModel) mo4a(coroutineScope, continuation)).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31333j;
        try {
            if (i != 0) {
                if (i == 1) {
                    C5729a.m12442O(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C5729a.m12442O(obj);
                }
                return Unit.f29502a;
            }
            C5729a.m12442O(obj);
            CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatchers.f29666b;
            a aVar = new a(null);
            this.f31333j = 1;
            if (C5729a.m12445R(mainCoroutineDispatcher, aVar, this) == intrinsics) {
                return intrinsics;
            }
        } catch (Exception e) {
            CommentViewModel3 commentViewModel3 = this.f31334k;
            this.f31333j = 2;
            if (commentViewModel3.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
