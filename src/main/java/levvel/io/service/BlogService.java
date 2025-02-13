package levvel.io.service;

import java.util.List;

import levvel.io.model.Blog;
import levvel.io.model.Comment;

public interface BlogService {

    void addBlog(Blog blog);

    Blog getBlog(String id);

    void addComment(Comment comment, String id);

    List<Comment> getComments(String id);

}
