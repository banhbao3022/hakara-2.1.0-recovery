package p000;

import android.view.View;
import mtp.media.karaoke.data.model.Comment;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p559a.p571g.CommentAdapter;
import p555j.p556a.p557a.p616i.ItemCommentBinding;

/* JADX INFO: renamed from: e */
/* JADX INFO: compiled from: java-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLongClickListenerC6204e implements View.OnLongClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f29610f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f29611g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f29612h;

    public ViewOnLongClickListenerC6204e(int i, Object obj, Object obj2) {
        this.f29610f = i;
        this.f29611g = obj;
        this.f29612h = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f29610f;
        if (i == 0) {
            Comment comment = ((ItemCommentBinding) this.f29611g).f32714C;
            if (comment != null) {
                InterfaceC6164l<Comment, Unit> interfaceC6164l = ((CommentAdapter) this.f29612h).f31313f;
                Intrinsics2.m13088d(comment, "this");
                interfaceC6164l.mo3b(comment);
            }
            return true;
        }
        if (i == 1) {
            Comment comment2 = ((ItemCommentBinding) this.f29611g).f32714C;
            if (comment2 != null) {
                InterfaceC6164l<Comment, Unit> interfaceC6164l2 = ((CommentAdapter) this.f29612h).f31313f;
                Intrinsics2.m13088d(comment2, "this");
                interfaceC6164l2.mo3b(comment2);
            }
            return true;
        }
        if (i != 2) {
            throw null;
        }
        Comment comment3 = ((ItemCommentBinding) this.f29611g).f32714C;
        if (comment3 != null) {
            InterfaceC6164l<Comment, Unit> interfaceC6164l3 = ((CommentAdapter) this.f29612h).f31313f;
            Intrinsics2.m13088d(comment3, "this");
            interfaceC6164l3.mo3b(comment3);
        }
        return true;
    }
}
