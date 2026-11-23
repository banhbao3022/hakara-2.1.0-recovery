package p000;

import android.view.View;
import android.widget.EditText;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import p007c.p451o.p452a.C5729a;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p559a.p571g.CommentViewModel;
import p555j.p556a.p557a.p558a.p559a.p571g.CommentViewModel3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p752p.C8310a;

/* JADX INFO: renamed from: b */
/* JADX INFO: compiled from: java-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0231b implements View.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f1420f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f1421g;

    public ViewOnClickListenerC0231b(int i, Object obj) {
        this.f1420f = i;
        this.f1421g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f1420f;
        if (i == 0) {
            PlayingActivity.m14376X((PlayingActivity) this.f1421g);
            return;
        }
        if (i == 1) {
            PlayingActivity.m14380b0((PlayingActivity) this.f1421g);
            return;
        }
        if (i != 2) {
            throw null;
        }
        EditText editText = (EditText) ((PlayingActivity) this.f1421g).m14383U(R.id.writeComment);
        Intrinsics2.m13088d(editText, "writeComment");
        String string = editText.getText().toString();
        if (!(!StringsJVM.m12990g(string))) {
            SkuDao.a.m14092i0((PlayingActivity) this.f1421g, R.string.msg_enter_comment_require, 0, 2);
            return;
        }
        CommentViewModel3 commentViewModel3 = (CommentViewModel3) ((PlayingActivity) this.f1421g).f33674z.getValue();
        PlayingActivity playingActivity = (PlayingActivity) this.f1421g;
        int i2 = playingActivity.f33651G;
        Integer numValueOf = Integer.valueOf(playingActivity.f33653I);
        Integer numValueOf2 = Integer.valueOf(((PlayingActivity) this.f1421g).f33654J);
        Objects.requireNonNull(commentViewModel3);
        Intrinsics2.m13089e("r", "contentType");
        Intrinsics2.m13089e(string, "message");
        C5729a.m12428A(C8310a.m16440e(commentViewModel3), null, 0, new CommentViewModel(commentViewModel3, i2, "r", string, numValueOf, numValueOf2, null), 3, null);
    }
}
