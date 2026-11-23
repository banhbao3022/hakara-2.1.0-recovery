package p000;

import android.graphics.Color;
import android.widget.TextView;
import mtp.media.karaoke.data.model.Comment;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p571g.CommentAdapter;
import p555j.p556a.p557a.p616i.ItemCommentBinding;

/* JADX INFO: renamed from: z */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C7417z extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34164g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34165h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f34166i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7417z(int i, Object obj, Object obj2) {
        super(0);
        this.f34164g = i;
        this.f34165h = obj;
        this.f34166i = obj2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        int i = this.f34164g;
        if (i == 0) {
            Comment comment = ((ItemCommentBinding) this.f34165h).f32714C;
            if (comment != null) {
                InterfaceC6164l<Comment, Unit> interfaceC6164l = ((CommentAdapter) this.f34166i).f31314g;
                Intrinsics2.m13088d(comment, "this");
                interfaceC6164l.mo3b(comment);
                comment.setLikeStatus(!comment.getLikeStatus());
                if (comment.getLikeStatus()) {
                    comment.setLikeCount(comment.getLikeCount() + 1);
                    ((ItemCommentBinding) this.f34165h).f32715t.setTextColor(Color.parseColor("#0288d1"));
                } else {
                    comment.setLikeCount(comment.getLikeCount() - 1);
                    ((ItemCommentBinding) this.f34165h).f32715t.setTextColor(Color.parseColor("#66000000"));
                }
                TextView textView = ((ItemCommentBinding) this.f34165h).f32713B;
                Intrinsics2.m13088d(textView, "txtLikeCountComment");
                textView.setText(String.valueOf(comment.getLikeCount()));
            }
            return Unit.f29502a;
        }
        if (i != 1) {
            if (i == 2) {
                Comment comment2 = ((ItemCommentBinding) this.f34165h).f32714C;
                if (comment2 != null) {
                    InterfaceC6164l<Comment, Unit> interfaceC6164l2 = ((CommentAdapter) this.f34166i).f31315h;
                    Intrinsics2.m13088d(comment2, "this");
                    interfaceC6164l2.mo3b(comment2);
                }
                return Unit.f29502a;
            }
            if (i != 3) {
                throw null;
            }
            Comment comment3 = ((ItemCommentBinding) this.f34165h).f32714C;
            if (comment3 != null) {
                InterfaceC6164l<Comment, Unit> interfaceC6164l3 = ((CommentAdapter) this.f34166i).f31316i;
                Intrinsics2.m13088d(comment3, "this");
                interfaceC6164l3.mo3b(comment3);
            }
            return Unit.f29502a;
        }
        Comment comment4 = ((ItemCommentBinding) this.f34165h).f32714C;
        if (comment4 != null) {
            InterfaceC6164l<Comment, Unit> interfaceC6164l4 = ((CommentAdapter) this.f34166i).f31314g;
            Intrinsics2.m13088d(comment4, "this");
            interfaceC6164l4.mo3b(comment4);
            comment4.setLikeStatus(!comment4.getLikeStatus());
            if (comment4.getLikeStatus()) {
                comment4.setLikeCount(comment4.getLikeCount() + 1);
                ((ItemCommentBinding) this.f34165h).f32715t.setTextColor(Color.parseColor("#0288d1"));
            } else {
                comment4.setLikeCount(comment4.getLikeCount() - 1);
                ((ItemCommentBinding) this.f34165h).f32715t.setTextColor(Color.parseColor("#66000000"));
            }
            TextView textView2 = ((ItemCommentBinding) this.f34165h).f32713B;
            Intrinsics2.m13088d(textView2, "txtLikeCountComment");
            textView2.setText(String.valueOf(comment4.getLikeCount()));
        }
        return Unit.f29502a;
    }
}
