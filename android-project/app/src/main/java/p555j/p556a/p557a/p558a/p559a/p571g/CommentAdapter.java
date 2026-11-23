package p555j.p556a.p557a.p558a.p559a.p571g;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Comment;
import mtp.media.karaoke.data.model.User;
import p000.C7417z;
import p000.ViewOnLongClickListenerC6204e;
import p007c.p071d.p078c.p079a.outline;
import p477d1.Unit;
import p477d1.p481d0.Strings5;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter3;
import p555j.p556a.p557a.p558a.p593c.LinkListener;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemCommentBinding;
import p555j.p556a.p557a.p619l.LinkUtils;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.g.a, reason: use source file name */
/* JADX INFO: compiled from: CommentAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CommentAdapter extends BaseListAdapter<Comment, ItemCommentBinding> {

    /* JADX INFO: renamed from: f */
    public final InterfaceC6164l<Comment, Unit> f31313f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6164l<Comment, Unit> f31314g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC6164l<Comment, Unit> f31315h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC6164l<Comment, Unit> f31316i;

    /* JADX INFO: renamed from: j */
    public final LinkListener f31317j;

    /* JADX INFO: renamed from: j.a.a.a.a.g.a$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements InterfaceC6164l<Comment, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31318g = new a(0);

        /* JADX INFO: renamed from: h */
        public static final a f31319h = new a(1);

        /* JADX INFO: renamed from: i */
        public static final a f31320i = new a(2);

        /* JADX INFO: renamed from: j */
        public static final a f31321j = new a(3);

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ int f31322k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(1);
            this.f31322k = i;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public final Unit mo3b(Comment comment) {
            int i = this.f31322k;
            if (i == 0) {
                Intrinsics2.m13089e(comment, "it");
                return Unit.f29502a;
            }
            if (i == 1) {
                Intrinsics2.m13089e(comment, "it");
                return Unit.f29502a;
            }
            if (i == 2) {
                Intrinsics2.m13089e(comment, "it");
                return Unit.f29502a;
            }
            if (i != 3) {
                throw null;
            }
            Intrinsics2.m13089e(comment, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.g.a$b */
    /* JADX INFO: compiled from: CommentAdapter.kt */
    public static final class b extends DiffUtil.e<Comment> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(Comment comment, Comment comment2) {
            Comment comment3 = comment;
            Comment comment4 = comment2;
            Intrinsics2.m13089e(comment3, "oldItem");
            Intrinsics2.m13089e(comment4, "newItem");
            return Intrinsics2.m13085a(comment3, comment4);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(Comment comment, Comment comment2) {
            Comment comment3 = comment;
            Comment comment4 = comment2;
            Intrinsics2.m13089e(comment3, "oldItem");
            Intrinsics2.m13089e(comment4, "newItem");
            return comment3.getId() == comment4.getId();
        }
    }

    public /* synthetic */ CommentAdapter(InterfaceC6164l interfaceC6164l, InterfaceC6164l interfaceC6164l2, InterfaceC6164l interfaceC6164l3, InterfaceC6164l interfaceC6164l4, LinkListener linkListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31318g : interfaceC6164l, (i & 2) != 0 ? a.f31319h : interfaceC6164l2, (i & 4) != 0 ? a.f31320i : interfaceC6164l3, (i & 8) != 0 ? a.f31321j : interfaceC6164l4, linkListener);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_comment;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewDataBinding viewDataBinding) {
        ItemCommentBinding itemCommentBinding = (ItemCommentBinding) viewDataBinding;
        Intrinsics2.m13089e(itemCommentBinding, "binding");
        TextView textView = itemCommentBinding.f32715t;
        Intrinsics2.m13088d(textView, "btnLikeComment");
        SkuDao.a.m14067S(textView, new C7417z(0, itemCommentBinding, this));
        ImageView imageView = itemCommentBinding.f32720y;
        Intrinsics2.m13088d(imageView, "iconLikeComment");
        SkuDao.a.m14067S(imageView, new C7417z(1, itemCommentBinding, this));
        TextView textView2 = itemCommentBinding.f32716u;
        Intrinsics2.m13088d(textView2, "btnReplyComment");
        SkuDao.a.m14067S(textView2, new C7417z(2, itemCommentBinding, this));
        AppCompatImageView appCompatImageView = itemCommentBinding.f32712A;
        Intrinsics2.m13088d(appCompatImageView, "thumbnail");
        SkuDao.a.m14067S(appCompatImageView, new C7417z(3, itemCommentBinding, this));
        itemCommentBinding.f32717v.setOnLongClickListener(new ViewOnLongClickListenerC6204e(0, itemCommentBinding, this));
        itemCommentBinding.f32721z.setOnLongClickListener(new ViewOnLongClickListenerC6204e(1, itemCommentBinding, this));
        itemCommentBinding.f32719x.setOnLongClickListener(new ViewOnLongClickListenerC6204e(2, itemCommentBinding, this));
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: o */
    public void mo666h(BaseListAdapter3<ItemCommentBinding> baseListAdapter3, int i) {
        Intrinsics2.m13089e(baseListAdapter3, "holder");
        super.mo666h(baseListAdapter3, i);
        Comment comment = (Comment) this.f39339d.f39163g.get(i);
        if (comment != null) {
            String message = comment.getMessage();
            User quote = comment.getQuote();
            if (quote == null) {
                View view = baseListAdapter3.f1003b;
                Intrinsics2.m13088d(view, "holder.itemView");
                TextView textView = (TextView) view.findViewById(R.id.message);
                Intrinsics2.m13088d(textView, "holder.itemView.message");
                textView.setText(message);
                return;
            }
            StringBuilder sbM1555F = outline.m1555F('@');
            sbM1555F.append(quote.getFullName());
            sbM1555F.append(' ');
            sbM1555F.append(comment.getMessage());
            String string = sbM1555F.toString();
            View view2 = baseListAdapter3.f1003b;
            Intrinsics2.m13088d(view2, "holder.itemView");
            TextView textView2 = (TextView) view2.findViewById(R.id.message);
            Intrinsics2.m13088d(textView2, "holder.itemView.message");
            LinkListener linkListener = this.f31317j;
            Intrinsics2.m13089e(textView2, "view");
            Intrinsics2.m13089e(string, "content");
            Intrinsics2.m13089e(quote, "quote");
            Intrinsics2.m13089e(linkListener, "listener");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            LinkUtils linkUtils = new LinkUtils(linkListener, quote);
            StringBuilder sbM1556G = outline.m1556G("@");
            sbM1556G.append(quote.getFullName());
            String string2 = sbM1556G.toString();
            spannableStringBuilder.setSpan(linkUtils, Strings5.m13012v(string, string2, 0, false, 6), string2.length() + Strings5.m13012v(string, string2, 0, false, 6), spannableStringBuilder.getSpanFlags(linkUtils));
            spannableStringBuilder.append((CharSequence) "\u200b");
            textView2.setText(spannableStringBuilder);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommentAdapter(InterfaceC6164l<? super Comment, Unit> interfaceC6164l, InterfaceC6164l<? super Comment, Unit> interfaceC6164l2, InterfaceC6164l<? super Comment, Unit> interfaceC6164l3, InterfaceC6164l<? super Comment, Unit> interfaceC6164l4, LinkListener linkListener) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        Intrinsics2.m13089e(interfaceC6164l2, "likeClickListener");
        Intrinsics2.m13089e(interfaceC6164l3, "replyClickListener");
        Intrinsics2.m13089e(interfaceC6164l4, "viewCommentAccountListener");
        Intrinsics2.m13089e(linkListener, "linkListener");
        this.f31313f = interfaceC6164l;
        this.f31314g = interfaceC6164l2;
        this.f31315h = interfaceC6164l3;
        this.f31316i = interfaceC6164l4;
        this.f31317j = linkListener;
    }
}
