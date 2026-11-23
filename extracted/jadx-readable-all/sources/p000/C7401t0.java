package p000;

import android.widget.TextView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.User;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingAdapter;
import p555j.p556a.p557a.p616i.ItemRecordingBinding;

/* JADX INFO: renamed from: t0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes2.dex */
public final class C7401t0 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34119g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34120h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f34121i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7401t0(int i, Object obj, Object obj2) {
        super(0);
        this.f34119g = i;
        this.f34120h = obj;
        this.f34121i = obj2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        User user;
        switch (this.f34119g) {
            case 0:
                Recording recording = ((ItemRecordingBinding) this.f34120h).f32831T;
                if (recording != null) {
                    InterfaceC6164l<Recording, Unit> interfaceC6164l = ((RecordingAdapter) this.f34121i).f31183j;
                    Intrinsics2.m13088d(recording, "this");
                    interfaceC6164l.mo3b(recording);
                }
                return Unit.f29502a;
            case 1:
                Recording recording2 = ((ItemRecordingBinding) this.f34120h).f32831T;
                if (recording2 != null) {
                    InterfaceC6164l<Recording, Unit> interfaceC6164l2 = ((RecordingAdapter) this.f34121i).f31184k;
                    Intrinsics2.m13088d(recording2, "this");
                    interfaceC6164l2.mo3b(recording2);
                    recording2.setLikeStatus(!recording2.getLikeStatus());
                    if (recording2.getLikeStatus()) {
                        recording2.setLikeCount(recording2.getLikeCount() + 1);
                        ((ItemRecordingBinding) this.f34120h).f32817F.setImageResource(R.drawable.ic_like_active);
                    } else {
                        recording2.setLikeCount(recording2.getLikeCount() - 1);
                        ((ItemRecordingBinding) this.f34120h).f32817F.setImageResource(R.drawable.ic_like);
                    }
                    TextView textView = ((ItemRecordingBinding) this.f34120h).f32824M;
                    Intrinsics2.m13088d(textView, "txtLikeCount");
                    textView.setText(String.valueOf(recording2.getLikeCount()));
                }
                return Unit.f29502a;
            case 2:
                Recording recording3 = ((ItemRecordingBinding) this.f34120h).f32831T;
                if (recording3 != null) {
                    InterfaceC6164l<Recording, Unit> interfaceC6164l3 = ((RecordingAdapter) this.f34121i).f31185l;
                    Intrinsics2.m13088d(recording3, "this");
                    interfaceC6164l3.mo3b(recording3);
                }
                return Unit.f29502a;
            case 3:
                Recording recording4 = ((ItemRecordingBinding) this.f34120h).f32831T;
                if (recording4 != null) {
                    InterfaceC6164l<Recording, Unit> interfaceC6164l4 = ((RecordingAdapter) this.f34121i).f31186m;
                    Intrinsics2.m13088d(recording4, "this");
                    interfaceC6164l4.mo3b(recording4);
                }
                return Unit.f29502a;
            case 4:
                Recording recording5 = ((ItemRecordingBinding) this.f34120h).f32831T;
                if (recording5 != null) {
                    InterfaceC6164l<Recording, Unit> interfaceC6164l5 = ((RecordingAdapter) this.f34121i).f31187n;
                    Intrinsics2.m13088d(recording5, "this");
                    interfaceC6164l5.mo3b(recording5);
                }
                return Unit.f29502a;
            case 5:
                Recording recording6 = ((ItemRecordingBinding) this.f34120h).f32831T;
                if (recording6 != null) {
                    InterfaceC6164l<Recording, Unit> interfaceC6164l6 = ((RecordingAdapter) this.f34121i).f31188o;
                    Intrinsics2.m13088d(recording6, "this");
                    interfaceC6164l6.mo3b(recording6);
                }
                return Unit.f29502a;
            case 6:
                Recording recording7 = ((ItemRecordingBinding) this.f34120h).f32831T;
                if (recording7 != null && (user = recording7.getUser()) != null) {
                    user.setFollowStatus(!user.getFollowStatus());
                    InterfaceC6164l<Recording, Unit> interfaceC6164l7 = ((RecordingAdapter) this.f34121i).f31189p;
                    Intrinsics2.m13088d(recording7, "this");
                    interfaceC6164l7.mo3b(recording7);
                    if (user.getFollowStatus()) {
                        ((ItemRecordingBinding) this.f34120h).f32833u.setBackgroundResource(R.drawable.bg_button_gray_basic_corners);
                        ((ItemRecordingBinding) this.f34120h).f32833u.setText(R.string.txt_following);
                        ((ItemRecordingBinding) this.f34120h).f32833u.setTextColor(-12303292);
                    } else {
                        ((ItemRecordingBinding) this.f34120h).f32833u.setBackgroundResource(R.drawable.bg_button_basic_corners);
                        ((ItemRecordingBinding) this.f34120h).f32833u.setText(R.string.txt_follow);
                        ((ItemRecordingBinding) this.f34120h).f32833u.setTextColor(-1);
                    }
                }
                return Unit.f29502a;
            case 7:
                Recording recording8 = ((ItemRecordingBinding) this.f34120h).f32831T;
                if (recording8 != null) {
                    InterfaceC6164l<Recording, Unit> interfaceC6164l8 = ((RecordingAdapter) this.f34121i).f31190q;
                    Intrinsics2.m13088d(recording8, "this");
                    interfaceC6164l8.mo3b(recording8);
                }
                return Unit.f29502a;
            case 8:
                Recording recording9 = ((ItemRecordingBinding) this.f34120h).f32831T;
                if (recording9 != null) {
                    InterfaceC6164l<Recording, Unit> interfaceC6164l9 = ((RecordingAdapter) this.f34121i).f31191r;
                    Intrinsics2.m13088d(recording9, "this");
                    interfaceC6164l9.mo3b(recording9);
                }
                return Unit.f29502a;
            default:
                throw null;
        }
    }
}
