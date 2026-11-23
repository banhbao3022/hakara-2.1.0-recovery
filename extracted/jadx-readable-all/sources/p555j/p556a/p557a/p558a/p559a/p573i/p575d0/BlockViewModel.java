package p555j.p556a.p557a.p558a.p559a.p573i.p575d0;

import java.util.ArrayList;
import java.util.HashMap;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.data.remote.response.GetListResponse;
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
import p555j.p556a.p557a.p606h.p614e.UserRepository;
import p636z0.p752p.C8310a;

/* JADX INFO: renamed from: j.a.a.a.a.i.d0.e, reason: use source file name */
/* JADX INFO: compiled from: BlockViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BlockViewModel extends BaseLoadMoreRefreshViewModel<User> {

    /* JADX INFO: renamed from: s */
    public final UserRepository f31435s;

    /* JADX INFO: renamed from: j.a.a.a.a.i.d0.e$a */
    /* JADX INFO: compiled from: BlockViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.profile.block.BlockViewModel$loadData$1", m13069f = "BlockViewModel.kt", m13070l = {19, 19, 21}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f31436j;

        /* JADX INFO: renamed from: k */
        public int f31437k;

        /* JADX INFO: renamed from: l */
        public int f31438l;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ int f31440n;

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ HashMap f31441o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, HashMap map, Continuation continuation) {
            super(2, continuation);
            this.f31440n = i;
            this.f31441o = map;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return BlockViewModel.this.new a(this.f31440n, this.f31441o, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return BlockViewModel.this.new a(this.f31440n, this.f31441o, continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            int i;
            BlockViewModel blockViewModel;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i2 = this.f31438l;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        i = this.f31437k;
                        blockViewModel = (BlockViewModel) this.f31436j;
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
                BlockViewModel blockViewModel2 = BlockViewModel.this;
                i = this.f31440n;
                UserRepository userRepository = blockViewModel2.f31435s;
                HashMap<String, Object> map = this.f31441o;
                this.f31436j = blockViewModel2;
                this.f31437k = i;
                this.f31438l = 1;
                Object objMo14230j = userRepository.mo14230j(map, this);
                if (objMo14230j == intrinsics) {
                    return intrinsics;
                }
                blockViewModel = blockViewModel2;
                obj = objMo14230j;
                ArrayList results = ((GetListResponse) obj).getResults();
                this.f31436j = null;
                this.f31438l = 2;
                if (blockViewModel.m13986v(i, results, this) == intrinsics) {
                    return intrinsics;
                }
            } catch (Exception e) {
                BlockViewModel blockViewModel3 = BlockViewModel.this;
                this.f31436j = null;
                this.f31438l = 3;
                if (blockViewModel3.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    public BlockViewModel(UserRepository userRepository) {
        Intrinsics2.m13089e(userRepository, "userRepository");
        this.f31435s = userRepository;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel
    /* JADX INFO: renamed from: u */
    public void mo13895u(int i) {
        HashMap map = new HashMap();
        map.put("page", String.valueOf(i));
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new a(i, map, null), 3, null);
    }
}
