package p555j.p556a.p557a.p558a.p559a.p571g;

import java.util.ArrayList;
import mtp.media.karaoke.data.model.Comment;
import mtp.media.karaoke.data.remote.response.GetListResponse;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;
import p555j.p556a.p557a.p606h.p614e.CommentRepository;
import p636z0.p752p.C8310a;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.g.e, reason: use source file name */
/* JADX INFO: compiled from: CommentViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CommentViewModel3 extends BaseLoadMoreRefreshViewModel<Comment> {

    /* JADX INFO: renamed from: s */
    public final MutableLiveData<Integer> f31346s;

    /* JADX INFO: renamed from: t */
    public final MutableLiveData<String> f31347t;

    /* JADX INFO: renamed from: u */
    public final MutableLiveData<Comment> f31348u;

    /* JADX INFO: renamed from: v */
    public final CommentRepository f31349v;

    /* JADX INFO: renamed from: j.a.a.a.a.g.e$a */
    /* JADX INFO: compiled from: CommentViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.comment.CommentViewModel$loadData$1", m13069f = "CommentViewModel.kt", m13070l = {37, 37, 39}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f31350j;

        /* JADX INFO: renamed from: k */
        public int f31351k;

        /* JADX INFO: renamed from: l */
        public int f31352l;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ int f31354n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Continuation continuation) {
            super(2, continuation);
            this.f31354n = i;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return CommentViewModel3.this.new a(this.f31354n, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return CommentViewModel3.this.new a(this.f31354n, continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            CommentViewModel3 commentViewModel3;
            int i;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i2 = this.f31352l;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        i = this.f31351k;
                        commentViewModel3 = (CommentViewModel3) this.f31350j;
                        C5729a.m12442O(obj);
                    } else {
                        if (i2 != 2 && i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C5729a.m12442O(obj);
                    }
                    return Unit.f29502a;
                }
                C5729a.m12442O(obj);
                int iIntValue = 0;
                String str = "r";
                Integer numM421d = CommentViewModel3.this.f31346s.m421d();
                if (numM421d != null) {
                    Intrinsics2.m13088d(numM421d, "it");
                    iIntValue = numM421d.intValue();
                }
                String strM421d = CommentViewModel3.this.f31347t.m421d();
                if (strM421d != null) {
                    Intrinsics2.m13088d(strM421d, "it");
                    str = strM421d;
                }
                CommentViewModel3 commentViewModel4 = CommentViewModel3.this;
                int i3 = this.f31354n;
                CommentRepository commentRepository = commentViewModel4.f31349v;
                this.f31350j = commentViewModel4;
                this.f31351k = i3;
                this.f31352l = 1;
                obj = commentRepository.mo14175b(iIntValue, str, i3, this);
                if (obj == intrinsics) {
                    return intrinsics;
                }
                commentViewModel3 = commentViewModel4;
                i = i3;
                ArrayList results = ((GetListResponse) obj).getResults();
                this.f31350j = null;
                this.f31352l = 2;
                if (commentViewModel3.m13986v(i, results, this) == intrinsics) {
                    return intrinsics;
                }
            } catch (Exception e) {
                CommentViewModel3 commentViewModel5 = CommentViewModel3.this;
                this.f31350j = null;
                this.f31352l = 3;
                if (commentViewModel5.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    public CommentViewModel3(CommentRepository commentRepository) {
        Intrinsics2.m13089e(commentRepository, "commentRepository");
        this.f31349v = commentRepository;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.mo427j(0);
        this.f31346s = mutableLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.mo427j("r");
        this.f31347t = mutableLiveData2;
        this.f31348u = new MutableLiveData<>();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel
    /* JADX INFO: renamed from: u */
    public void mo13895u(int i) {
        StringBuilder sbM1556G = outline.m1556G("comment loadData ");
        sbM1556G.append(this.f31346s.m421d());
        Intrinsics2.m13089e(sbM1556G.toString(), "message");
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new a(i, null), 3, null);
    }
}
