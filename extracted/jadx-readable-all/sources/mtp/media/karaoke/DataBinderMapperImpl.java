package mtp.media.karaoke;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p555j.p556a.p557a.p616i.BlockActivityBindingImpl;
import p555j.p556a.p557a.p616i.CoinFragmentBindingImpl;
import p555j.p556a.p557a.p616i.CommentFragmentBindingImpl;
import p555j.p556a.p557a.p616i.DiamondFragmentBindingImpl;
import p555j.p556a.p557a.p616i.DraftFragmentBindingImpl;
import p555j.p556a.p557a.p616i.DuetActivityBindingImpl;
import p555j.p556a.p557a.p616i.DuetCreateActivityBindingImpl;
import p555j.p556a.p557a.p616i.DuetInviteFragmentBindingImpl;
import p555j.p556a.p557a.p616i.DuetOwnerActivityBindingImpl;
import p555j.p556a.p557a.p616i.ExploreFragmentBindingImpl;
import p555j.p556a.p557a.p616i.ExploreRecordingActivityBindingImpl;
import p555j.p556a.p557a.p616i.FanGiftActivityBindingImpl;
import p555j.p556a.p557a.p616i.FeedFragmentBindingImpl;
import p555j.p556a.p557a.p616i.FragmentBackgroundBindingImpl;
import p555j.p556a.p557a.p616i.FragmentLoadmoreRefreshBindingImpl;
import p555j.p556a.p557a.p616i.GiftFragmentBindingImpl;
import p555j.p556a.p557a.p616i.ImageActivityBindingImpl;
import p555j.p556a.p557a.p616i.ImageFragmentBindingImpl;
import p555j.p556a.p557a.p616i.ItemBackgroundBindingImpl;
import p555j.p556a.p557a.p616i.ItemCheckinDayBindingImpl;
import p555j.p556a.p557a.p616i.ItemCommentBindingImpl;
import p555j.p556a.p557a.p616i.ItemDiamondSkuBindingImpl;
import p555j.p556a.p557a.p616i.ItemDraftBindingImpl;
import p555j.p556a.p557a.p616i.ItemDuetInviteBindingImpl;
import p555j.p556a.p557a.p616i.ItemDuetOwnerJoinedBindingImpl;
import p555j.p556a.p557a.p616i.ItemDuetTrendingBindingImpl;
import p555j.p556a.p557a.p616i.ItemExploreBindingImpl;
import p555j.p556a.p557a.p616i.ItemFanGiftBindingImpl;
import p555j.p556a.p557a.p616i.ItemGiftBindingImpl;
import p555j.p556a.p557a.p616i.ItemGiftPresentBindingImpl;
import p555j.p556a.p557a.p616i.ItemImageBindingImpl;
import p555j.p556a.p557a.p616i.ItemKeywordBindingImpl;
import p555j.p556a.p557a.p616i.ItemNotificationBindingImpl;
import p555j.p556a.p557a.p616i.ItemPlayingGiftRankingBindingImpl;
import p555j.p556a.p557a.p616i.ItemPrivacyBindingImpl;
import p555j.p556a.p557a.p616i.ItemRecordingBindingImpl;
import p555j.p556a.p557a.p616i.ItemRecordingRankingBindingImpl;
import p555j.p556a.p557a.p616i.ItemRecordingTrendingBindingImpl;
import p555j.p556a.p557a.p616i.ItemShareBindingImpl;
import p555j.p556a.p557a.p616i.ItemSongBindingImpl;
import p555j.p556a.p557a.p616i.ItemTaskBindingImpl;
import p555j.p556a.p557a.p616i.ItemTaskCheckinBindingImpl;
import p555j.p556a.p557a.p616i.ItemUserBindingImpl;
import p555j.p556a.p557a.p616i.ItemUserBlockBindingImpl;
import p555j.p556a.p557a.p616i.ItemUserInviteBindingImpl;
import p555j.p556a.p557a.p616i.ItemUserInvitedBindingImpl;
import p555j.p556a.p557a.p616i.ItemUserSuggestionBindingImpl;
import p555j.p556a.p557a.p616i.LevelActivityBindingImpl;
import p555j.p556a.p557a.p616i.LoginFragmentBindingImpl;
import p555j.p556a.p557a.p616i.MainActivityBindingImpl;
import p555j.p556a.p557a.p616i.NotificationFragmentBindingImpl;
import p555j.p556a.p557a.p616i.PlayingActivityBindingImpl;
import p555j.p556a.p557a.p616i.PostActivityBindingImpl;
import p555j.p556a.p557a.p616i.PresentActivityBindingImpl;
import p555j.p556a.p557a.p616i.ProcessActivityBindingImpl;
import p555j.p556a.p557a.p616i.ProfileEditActivityBindingImpl;
import p555j.p556a.p557a.p616i.ProfileFragmentBindingImpl;
import p555j.p556a.p557a.p616i.ProfileRecordingFragmentBindingImpl;
import p555j.p556a.p557a.p616i.RecordingFragmentBindingImpl;
import p555j.p556a.p557a.p616i.RecordingRankingFragmentBindingImpl;
import p555j.p556a.p557a.p616i.SearchActivityBindingImpl;
import p555j.p556a.p557a.p616i.SearchFragmentBindingImpl;
import p555j.p556a.p557a.p616i.SearchSongFragmentBindingImpl;
import p555j.p556a.p557a.p616i.SettingActivityBindingImpl;
import p555j.p556a.p557a.p616i.ShareFragmentBindingImpl;
import p555j.p556a.p557a.p616i.SingActivityBindingImpl;
import p555j.p556a.p557a.p616i.SongDetailActivityBindingImpl;
import p555j.p556a.p557a.p616i.SongFragmentBindingImpl;
import p555j.p556a.p557a.p616i.SongbookFragmentBindingImpl;
import p555j.p556a.p557a.p616i.StarFragmentBindingImpl;
import p555j.p556a.p557a.p616i.TaskActivityBindingImpl;
import p555j.p556a.p557a.p616i.UserActivityBindingImpl;
import p555j.p556a.p557a.p616i.UserInviteActivityBindingImpl;
import p555j.p556a.p557a.p616i.UserInviteFragmentBindingImpl;
import p555j.p556a.p557a.p616i.WalletActivityBindingImpl;
import p636z0.p748n.DataBinderMapper;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* JADX INFO: renamed from: a */
    public static final SparseIntArray f33372a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(75);
        f33372a = sparseIntArray;
        sparseIntArray.put(R.layout.block_activity, 1);
        sparseIntArray.put(R.layout.coin_fragment, 2);
        sparseIntArray.put(R.layout.comment_fragment, 3);
        sparseIntArray.put(R.layout.diamond_fragment, 4);
        sparseIntArray.put(R.layout.draft_fragment, 5);
        sparseIntArray.put(R.layout.duet_activity, 6);
        sparseIntArray.put(R.layout.duet_create_activity, 7);
        sparseIntArray.put(R.layout.duet_invite_fragment, 8);
        sparseIntArray.put(R.layout.duet_owner_activity, 9);
        sparseIntArray.put(R.layout.explore_fragment, 10);
        sparseIntArray.put(R.layout.explore_recording_activity, 11);
        sparseIntArray.put(R.layout.fan_gift_activity, 12);
        sparseIntArray.put(R.layout.feed_fragment, 13);
        sparseIntArray.put(R.layout.fragment_background, 14);
        sparseIntArray.put(R.layout.fragment_loadmore_refresh, 15);
        sparseIntArray.put(R.layout.gift_fragment, 16);
        sparseIntArray.put(R.layout.image_activity, 17);
        sparseIntArray.put(R.layout.image_fragment, 18);
        sparseIntArray.put(R.layout.item_background, 19);
        sparseIntArray.put(R.layout.item_checkin_day, 20);
        sparseIntArray.put(R.layout.item_comment, 21);
        sparseIntArray.put(R.layout.item_diamond_sku, 22);
        sparseIntArray.put(R.layout.item_draft, 23);
        sparseIntArray.put(R.layout.item_duet_invite, 24);
        sparseIntArray.put(R.layout.item_duet_owner_joined, 25);
        sparseIntArray.put(R.layout.item_duet_trending, 26);
        sparseIntArray.put(R.layout.item_explore, 27);
        sparseIntArray.put(R.layout.item_fan_gift, 28);
        sparseIntArray.put(R.layout.item_gift, 29);
        sparseIntArray.put(R.layout.item_gift_present, 30);
        sparseIntArray.put(R.layout.item_image, 31);
        sparseIntArray.put(R.layout.item_keyword, 32);
        sparseIntArray.put(R.layout.item_notification, 33);
        sparseIntArray.put(R.layout.item_playing_gift_ranking, 34);
        sparseIntArray.put(R.layout.item_privacy, 35);
        sparseIntArray.put(R.layout.item_recording, 36);
        sparseIntArray.put(R.layout.item_recording_ranking, 37);
        sparseIntArray.put(R.layout.item_recording_trending, 38);
        sparseIntArray.put(R.layout.item_share, 39);
        sparseIntArray.put(R.layout.item_song, 40);
        sparseIntArray.put(R.layout.item_task, 41);
        sparseIntArray.put(R.layout.item_task_checkin, 42);
        sparseIntArray.put(R.layout.item_user, 43);
        sparseIntArray.put(R.layout.item_user_block, 44);
        sparseIntArray.put(R.layout.item_user_invite, 45);
        sparseIntArray.put(R.layout.item_user_invited, 46);
        sparseIntArray.put(R.layout.item_user_suggestion, 47);
        sparseIntArray.put(R.layout.level_activity, 48);
        sparseIntArray.put(R.layout.login_fragment, 49);
        sparseIntArray.put(R.layout.main_activity, 50);
        sparseIntArray.put(R.layout.notification_fragment, 51);
        sparseIntArray.put(R.layout.playing_activity, 52);
        sparseIntArray.put(R.layout.post_activity, 53);
        sparseIntArray.put(R.layout.present_activity, 54);
        sparseIntArray.put(R.layout.process_activity, 55);
        sparseIntArray.put(R.layout.profile_edit_activity, 56);
        sparseIntArray.put(R.layout.profile_fragment, 57);
        sparseIntArray.put(R.layout.profile_recording_fragment, 58);
        sparseIntArray.put(R.layout.recording_fragment, 59);
        sparseIntArray.put(R.layout.recording_ranking_fragment, 60);
        sparseIntArray.put(R.layout.search_activity, 61);
        sparseIntArray.put(R.layout.search_fragment, 62);
        sparseIntArray.put(R.layout.search_song_fragment, 63);
        sparseIntArray.put(R.layout.setting_activity, 64);
        sparseIntArray.put(R.layout.share_fragment, 65);
        sparseIntArray.put(R.layout.sing_activity, 66);
        sparseIntArray.put(R.layout.song_detail_activity, 67);
        sparseIntArray.put(R.layout.song_fragment, 68);
        sparseIntArray.put(R.layout.songbook_fragment, 69);
        sparseIntArray.put(R.layout.star_fragment, 70);
        sparseIntArray.put(R.layout.task_activity, 71);
        sparseIntArray.put(R.layout.user_activity, 72);
        sparseIntArray.put(R.layout.user_invite_activity, 73);
        sparseIntArray.put(R.layout.user_invite_fragment, 74);
        sparseIntArray.put(R.layout.wallet_activity, 75);
    }

    @Override // p636z0.p748n.DataBinderMapper
    /* JADX INFO: renamed from: a */
    public List<DataBinderMapper> mo412a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // p636z0.p748n.DataBinderMapper
    /* JADX INFO: renamed from: b */
    public ViewDataBinding mo384b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f33372a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            int i3 = (i2 - 1) / 50;
            if (i3 == 0) {
                switch (i2) {
                    case 1:
                        if ("layout/block_activity_0".equals(tag)) {
                            return new BlockActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for block_activity is invalid. Received: ", tag));
                    case 2:
                        if ("layout/coin_fragment_0".equals(tag)) {
                            return new CoinFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for coin_fragment is invalid. Received: ", tag));
                    case 3:
                        if ("layout/comment_fragment_0".equals(tag)) {
                            return new CommentFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for comment_fragment is invalid. Received: ", tag));
                    case 4:
                        if ("layout/diamond_fragment_0".equals(tag)) {
                            return new DiamondFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for diamond_fragment is invalid. Received: ", tag));
                    case 5:
                        if ("layout/draft_fragment_0".equals(tag)) {
                            return new DraftFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for draft_fragment is invalid. Received: ", tag));
                    case 6:
                        if ("layout/duet_activity_0".equals(tag)) {
                            return new DuetActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for duet_activity is invalid. Received: ", tag));
                    case 7:
                        if ("layout/duet_create_activity_0".equals(tag)) {
                            return new DuetCreateActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for duet_create_activity is invalid. Received: ", tag));
                    case 8:
                        if ("layout/duet_invite_fragment_0".equals(tag)) {
                            return new DuetInviteFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for duet_invite_fragment is invalid. Received: ", tag));
                    case 9:
                        if ("layout/duet_owner_activity_0".equals(tag)) {
                            return new DuetOwnerActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for duet_owner_activity is invalid. Received: ", tag));
                    case 10:
                        if ("layout/explore_fragment_0".equals(tag)) {
                            return new ExploreFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for explore_fragment is invalid. Received: ", tag));
                    case 11:
                        if ("layout/explore_recording_activity_0".equals(tag)) {
                            return new ExploreRecordingActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for explore_recording_activity is invalid. Received: ", tag));
                    case 12:
                        if ("layout/fan_gift_activity_0".equals(tag)) {
                            return new FanGiftActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for fan_gift_activity is invalid. Received: ", tag));
                    case 13:
                        if ("layout/feed_fragment_0".equals(tag)) {
                            return new FeedFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for feed_fragment is invalid. Received: ", tag));
                    case 14:
                        if ("layout/fragment_background_0".equals(tag)) {
                            return new FragmentBackgroundBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for fragment_background is invalid. Received: ", tag));
                    case 15:
                        if ("layout/fragment_loadmore_refresh_0".equals(tag)) {
                            return new FragmentLoadmoreRefreshBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for fragment_loadmore_refresh is invalid. Received: ", tag));
                    case 16:
                        if ("layout/gift_fragment_0".equals(tag)) {
                            return new GiftFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for gift_fragment is invalid. Received: ", tag));
                    case 17:
                        if ("layout/image_activity_0".equals(tag)) {
                            return new ImageActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for image_activity is invalid. Received: ", tag));
                    case 18:
                        if ("layout/image_fragment_0".equals(tag)) {
                            return new ImageFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for image_fragment is invalid. Received: ", tag));
                    case 19:
                        if ("layout/item_background_0".equals(tag)) {
                            return new ItemBackgroundBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_background is invalid. Received: ", tag));
                    case 20:
                        if ("layout/item_checkin_day_0".equals(tag)) {
                            return new ItemCheckinDayBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_checkin_day is invalid. Received: ", tag));
                    case 21:
                        if ("layout/item_comment_0".equals(tag)) {
                            return new ItemCommentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_comment is invalid. Received: ", tag));
                    case 22:
                        if ("layout/item_diamond_sku_0".equals(tag)) {
                            return new ItemDiamondSkuBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_diamond_sku is invalid. Received: ", tag));
                    case 23:
                        if ("layout/item_draft_0".equals(tag)) {
                            return new ItemDraftBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_draft is invalid. Received: ", tag));
                    case 24:
                        if ("layout/item_duet_invite_0".equals(tag)) {
                            return new ItemDuetInviteBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_duet_invite is invalid. Received: ", tag));
                    case 25:
                        if ("layout/item_duet_owner_joined_0".equals(tag)) {
                            return new ItemDuetOwnerJoinedBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_duet_owner_joined is invalid. Received: ", tag));
                    case 26:
                        if ("layout/item_duet_trending_0".equals(tag)) {
                            return new ItemDuetTrendingBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_duet_trending is invalid. Received: ", tag));
                    case 27:
                        if ("layout/item_explore_0".equals(tag)) {
                            return new ItemExploreBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_explore is invalid. Received: ", tag));
                    case 28:
                        if ("layout/item_fan_gift_0".equals(tag)) {
                            return new ItemFanGiftBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_fan_gift is invalid. Received: ", tag));
                    case 29:
                        if ("layout/item_gift_0".equals(tag)) {
                            return new ItemGiftBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_gift is invalid. Received: ", tag));
                    case 30:
                        if ("layout/item_gift_present_0".equals(tag)) {
                            return new ItemGiftPresentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_gift_present is invalid. Received: ", tag));
                    case 31:
                        if ("layout/item_image_0".equals(tag)) {
                            return new ItemImageBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_image is invalid. Received: ", tag));
                    case 32:
                        if ("layout/item_keyword_0".equals(tag)) {
                            return new ItemKeywordBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_keyword is invalid. Received: ", tag));
                    case 33:
                        if ("layout/item_notification_0".equals(tag)) {
                            return new ItemNotificationBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_notification is invalid. Received: ", tag));
                    case 34:
                        if ("layout/item_playing_gift_ranking_0".equals(tag)) {
                            return new ItemPlayingGiftRankingBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_playing_gift_ranking is invalid. Received: ", tag));
                    case 35:
                        if ("layout/item_privacy_0".equals(tag)) {
                            return new ItemPrivacyBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_privacy is invalid. Received: ", tag));
                    case 36:
                        if ("layout/item_recording_0".equals(tag)) {
                            return new ItemRecordingBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_recording is invalid. Received: ", tag));
                    case 37:
                        if ("layout/item_recording_ranking_0".equals(tag)) {
                            return new ItemRecordingRankingBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_recording_ranking is invalid. Received: ", tag));
                    case 38:
                        if ("layout/item_recording_trending_0".equals(tag)) {
                            return new ItemRecordingTrendingBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_recording_trending is invalid. Received: ", tag));
                    case 39:
                        if ("layout/item_share_0".equals(tag)) {
                            return new ItemShareBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_share is invalid. Received: ", tag));
                    case 40:
                        if ("layout/item_song_0".equals(tag)) {
                            return new ItemSongBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_song is invalid. Received: ", tag));
                    case 41:
                        if ("layout/item_task_0".equals(tag)) {
                            return new ItemTaskBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_task is invalid. Received: ", tag));
                    case 42:
                        if ("layout/item_task_checkin_0".equals(tag)) {
                            return new ItemTaskCheckinBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_task_checkin is invalid. Received: ", tag));
                    case 43:
                        if ("layout/item_user_0".equals(tag)) {
                            return new ItemUserBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_user is invalid. Received: ", tag));
                    case 44:
                        if ("layout/item_user_block_0".equals(tag)) {
                            return new ItemUserBlockBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_user_block is invalid. Received: ", tag));
                    case 45:
                        if ("layout/item_user_invite_0".equals(tag)) {
                            return new ItemUserInviteBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_user_invite is invalid. Received: ", tag));
                    case 46:
                        if ("layout/item_user_invited_0".equals(tag)) {
                            return new ItemUserInvitedBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_user_invited is invalid. Received: ", tag));
                    case 47:
                        if ("layout/item_user_suggestion_0".equals(tag)) {
                            return new ItemUserSuggestionBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for item_user_suggestion is invalid. Received: ", tag));
                    case 48:
                        if ("layout/level_activity_0".equals(tag)) {
                            return new LevelActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for level_activity is invalid. Received: ", tag));
                    case 49:
                        if ("layout/login_fragment_0".equals(tag)) {
                            return new LoginFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for login_fragment is invalid. Received: ", tag));
                    case 50:
                        if ("layout/main_activity_0".equals(tag)) {
                            return new MainActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for main_activity is invalid. Received: ", tag));
                    default:
                        return null;
                }
            }
            if (i3 == 1) {
                switch (i2) {
                    case 51:
                        if ("layout/notification_fragment_0".equals(tag)) {
                            return new NotificationFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for notification_fragment is invalid. Received: ", tag));
                    case 52:
                        if ("layout/playing_activity_0".equals(tag)) {
                            return new PlayingActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for playing_activity is invalid. Received: ", tag));
                    case 53:
                        if ("layout/post_activity_0".equals(tag)) {
                            return new PostActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for post_activity is invalid. Received: ", tag));
                    case 54:
                        if ("layout/present_activity_0".equals(tag)) {
                            return new PresentActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for present_activity is invalid. Received: ", tag));
                    case 55:
                        if ("layout/process_activity_0".equals(tag)) {
                            return new ProcessActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for process_activity is invalid. Received: ", tag));
                    case 56:
                        if ("layout/profile_edit_activity_0".equals(tag)) {
                            return new ProfileEditActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for profile_edit_activity is invalid. Received: ", tag));
                    case 57:
                        if ("layout/profile_fragment_0".equals(tag)) {
                            return new ProfileFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for profile_fragment is invalid. Received: ", tag));
                    case 58:
                        if ("layout/profile_recording_fragment_0".equals(tag)) {
                            return new ProfileRecordingFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for profile_recording_fragment is invalid. Received: ", tag));
                    case 59:
                        if ("layout/recording_fragment_0".equals(tag)) {
                            return new RecordingFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for recording_fragment is invalid. Received: ", tag));
                    case 60:
                        if ("layout/recording_ranking_fragment_0".equals(tag)) {
                            return new RecordingRankingFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for recording_ranking_fragment is invalid. Received: ", tag));
                    case 61:
                        if ("layout/search_activity_0".equals(tag)) {
                            return new SearchActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for search_activity is invalid. Received: ", tag));
                    case 62:
                        if ("layout/search_fragment_0".equals(tag)) {
                            return new SearchFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for search_fragment is invalid. Received: ", tag));
                    case 63:
                        if ("layout/search_song_fragment_0".equals(tag)) {
                            return new SearchSongFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for search_song_fragment is invalid. Received: ", tag));
                    case 64:
                        if ("layout/setting_activity_0".equals(tag)) {
                            return new SettingActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for setting_activity is invalid. Received: ", tag));
                    case 65:
                        if ("layout/share_fragment_0".equals(tag)) {
                            return new ShareFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for share_fragment is invalid. Received: ", tag));
                    case 66:
                        if ("layout/sing_activity_0".equals(tag)) {
                            return new SingActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for sing_activity is invalid. Received: ", tag));
                    case 67:
                        if ("layout/song_detail_activity_0".equals(tag)) {
                            return new SongDetailActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for song_detail_activity is invalid. Received: ", tag));
                    case 68:
                        if ("layout/song_fragment_0".equals(tag)) {
                            return new SongFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for song_fragment is invalid. Received: ", tag));
                    case 69:
                        if ("layout/songbook_fragment_0".equals(tag)) {
                            return new SongbookFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for songbook_fragment is invalid. Received: ", tag));
                    case 70:
                        if ("layout/star_fragment_0".equals(tag)) {
                            return new StarFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for star_fragment is invalid. Received: ", tag));
                    case 71:
                        if ("layout/task_activity_0".equals(tag)) {
                            return new TaskActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for task_activity is invalid. Received: ", tag));
                    case 72:
                        if ("layout/user_activity_0".equals(tag)) {
                            return new UserActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for user_activity is invalid. Received: ", tag));
                    case 73:
                        if ("layout/user_invite_activity_0".equals(tag)) {
                            return new UserInviteActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for user_invite_activity is invalid. Received: ", tag));
                    case 74:
                        if ("layout/user_invite_fragment_0".equals(tag)) {
                            return new UserInviteFragmentBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for user_invite_fragment is invalid. Received: ", tag));
                    case 75:
                        if ("layout/wallet_activity_0".equals(tag)) {
                            return new WalletActivityBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException(outline.m1598t("The tag for wallet_activity is invalid. Received: ", tag));
                    default:
                        return null;
                }
            }
        }
        return null;
    }

    @Override // p636z0.p748n.DataBinderMapper
    /* JADX INFO: renamed from: c */
    public ViewDataBinding mo385c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f33372a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
